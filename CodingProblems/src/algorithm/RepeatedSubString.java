package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RepeatedSubString {

	public static void main(String[] args) {
		
		String str = "abcabcabcabc";
		String str2 = "abab";
		String str3 = "aba";
		System.out.println(repeatedSubstringPattern(str3));
		
	}
	
	
	public static boolean isRepeatedSubstring(String str) {
		
		char temp = str.charAt(0);
		str += " ";
		List<String> sList = new ArrayList<>();

		for (int i = 1, j = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == temp || i == str.length() - 1) {
				sList.add(str.substring(j, i));
				j = i;
			}
		}
		
		for (int i = 0; i < sList.size() - 1; i++) {
			
			if (!sList.get(i).equals(sList.get(i + 1)))
				return false;
		}
		
		return true;
	}

	
    public static boolean repeatedSubstringPattern(String s) {
    	
    	char first = s.charAt(0);
    	int firstIdx = 0;
    	int nextIdx = s.indexOf(first, 1);
    	
    	while (nextIdx >= 0) {
    		String str = s.substring(firstIdx, nextIdx);
    		StringBuilder sb = new StringBuilder(s.substring(nextIdx));
    		
    		while (sb.length() >= str.length()) {
    			String subStr = sb.substring(firstIdx, nextIdx);
    			
    			if (!str.equals(subStr)) {
    				return false;
    			}
    			sb.delete(firstIdx, nextIdx);
    		}
    		if (sb.length() == 0) {
    			return true;
    		}
    		nextIdx = s.indexOf(first, nextIdx + 1);
    	}
    	
    	return false;
    }
}
