package algorithm;

public class FancyString {
	
	public static void main(String[] args) {
		String s = "leeetcode";
		String s2 = "aaabaaaa";
		
		String res = makeFancyString(s2);
		System.out.println(res);
	}

    public static String makeFancyString(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	char prev = s.charAt(0);
    	int count = 0;
    	
    	for (int i = 1; i < sb.length(); i++) {
    		if (sb.charAt(i) != prev || i == sb.length() - 1) {
    			prev = sb.charAt(i);
    			if (count >= 2) {
        			sb.delete(i - count - 1, i - 2);
        		}
    			count = 0;
    			continue;
    		}
    		count++;
    	}
    	
    	return sb.toString();
    }
}
