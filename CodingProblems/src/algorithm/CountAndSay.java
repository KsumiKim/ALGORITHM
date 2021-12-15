package algorithm;

public class CountAndSay {
	
	public static void main(String[] args) {
		int n = 5;
		String res = countAndSay(n);
		System.out.println(res);
	}
	
    public static String countAndSay(int n) {
    	if (n == 1)
    		return "1";
    	
    	int init = 1;
    	StringBuilder sb = new StringBuilder("1");
    	
    	while (init++ < n) {
    		String str = sb.toString();
			sb.delete(0, sb.length());
    		
    		for (int i = 0; i < str.length(); ) {
    			char initChar = str.charAt(i);
    			int nextIdx = i + 1;
    			
    			while (nextIdx < str.length()) {
    				if (str.charAt(nextIdx) != initChar) {
    					break;
    				}
    				nextIdx++;
    			}
    			int count = nextIdx > i + 1 ? nextIdx - i : 1;
    			
    			sb.append(count);
    			sb.append(str.charAt(i));
    			i += count;
    		}
    		
    	}
    	return sb.toString();
    }
}
