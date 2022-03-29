package algorithm;

public class PrefixOfArray {
	
	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] words = {"i","love","leetcode","apples"};
		
		String s2 = "iloveleetcode";
		String[] words2 = {"apples","i","love","leetcode"};
		
		boolean res = isPrefixString(s2, words2);
		System.out.println(res);
	}

    public static boolean isPrefixString(String s, String[] words) {
    	StringBuilder sb = new StringBuilder(s);
    	
    	for (String word : words) {
    		if (sb.indexOf(word) > 0 || sb.indexOf(word) < 0) {
    			return false;
    		}
    		sb.delete(0, word.length());
    		
    		if (sb.length() == 0) {
    			return true;
    		}
    	}
    	
    	return sb.length() == 0;
    }
}
