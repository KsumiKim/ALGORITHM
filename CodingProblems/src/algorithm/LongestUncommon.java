package algorithm;

public class LongestUncommon {
	
	public static void main(String[] args) {
		String a = "aba", b = "cdc";
		String a2 = "aaa", b2 = "bbb";
		String a3 = "aaa", b3 = "aaa";
		
		int res = findLUSlength(a3, b3);
		System.out.println(res);
	}

    public static int findLUSlength(String a, String b) {
    	StringBuilder sb = new StringBuilder();
    	boolean common = false;
    	
    	for (int i = 0; i < a.length(); i++) {
    		sb.append(a.charAt(i));
    		
    		if (b.indexOf(sb.toString()) >= 0) {
    			common = true;
    			break;
    		}
    	}
    	
    	return sb.length() == 1 && common ? -1 : sb.length();
    }

}
