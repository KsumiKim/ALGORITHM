package algorithm;

public class StringSubsequence {
	
	public static void main(String[] args) {
		String s = "hackerworld";
		String res = hackerrankInString(s);
		System.out.println(res);
	}

    public static String hackerrankInString(String s) {
    	final String HACKER_RANK = "hackerrank";
    	
    	int start = 0;
    	for (char c : HACKER_RANK.toCharArray()) {
    		boolean contains = false;
    		
    		for (int i = start; i < s.length(); i++) {
    			if (s.charAt(i) == c) {
    				start++;
    				contains = true;
    				break;
    			}
    		}
    		if (!contains) {
    			return "NO";
    		}
    	}
    	return "YES";
    }
}
