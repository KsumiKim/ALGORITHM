package algorithm;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		
		String res = longestCommonPrefix(strs2);
		System.out.println(res);
	}

    public static String longestCommonPrefix(String[] strs) {
    	String first = strs[0];
    	String lcp = "";
    	
    	for (int i = 1; i < strs.length; i++) {
    		int k = 0, j = 0;
    		
    		while (k < first.length() && j < strs[i].length()) {
    			if (first.charAt(k) != strs[i].charAt(j)) {
    				break;
    			}
    			k++;
    			j++;
    		}
    		String prefix = first.substring(0, k);
    		
    		if (lcp.equals("") || lcp.length() > prefix.length()) {
    			lcp = prefix;
    		}
    	}
    	return lcp;
    }

}
