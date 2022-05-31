package algorithm;

import java.util.HashSet;

public class FindDifference {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		
		System.out.println(findTheDifference2(s, t));
	}
	
	public static char findDifference(String t, String s) {
		HashSet<Character> set = new HashSet<Character>();
		
		for (char c : s.toCharArray())
			set.add(c);
		
		char result = '\u0000';
		
		for (int i = 0; i < t.length(); i++) {
			
			if (!set.contains(t.charAt(i))) {
				result = t.charAt(i);
				break;
			}
		}
		
		return result;
	}
	
	public static char findTheDifference(String s, String t) {
		
		int charNum = t.charAt(s.length());
		
		for (int i = 0; i < charNum; i++) {
			charNum -= s.charAt(i);
			charNum += t.charAt(i);
					
		}
		
		return (char)charNum;
	}

    public static char findTheDifference2(String s, String t) {
    	StringBuilder sb = new StringBuilder(s);
    	
    	for (int i = 0; i < t.length(); i++) {
    		char curr = t.charAt(i);
    		if (sb.indexOf(curr + "") < 0) {
    			return curr;
    		}
    		sb.deleteCharAt(sb.indexOf(curr + ""));
    	}
    	return ' ';
    }
}
