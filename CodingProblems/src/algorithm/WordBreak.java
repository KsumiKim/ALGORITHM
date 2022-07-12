package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordBreak {
	
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("leet");
		wordDict.add("code");
		

		String s2 = "applepenapple";
		List<String> wordDict2 = new ArrayList<String>();
		wordDict2.add("apple");
		wordDict2.add("pen");
		

		String s3 = "catsandog";
		List<String> wordDict3 = new ArrayList<String>();
		wordDict3.add("cats");
		wordDict3.add("dog");
		wordDict3.add("sand");
		wordDict3.add("and");
		wordDict3.add("cat");
		
		boolean res = wordBreak(s3, wordDict3);
		System.out.println(res);
	}

    public static boolean wordBreak(String s, List<String> wordDict) {
    	StringBuilder sb = new StringBuilder(s);    	
    	
    	while (sb.length() > 0) {
        	boolean containsSegment = false; 
        	
        	for (int i = 0; i < wordDict.size(); i++) {
        		String word = wordDict.get(i);
        		
        		if (sb.indexOf(word) >= 0) {
        			containsSegment = true;
        			sb.delete(sb.indexOf(word), sb.indexOf(word) + word.length());
        		}
        	}
        	if (!containsSegment) {
        		return false;
        	}
    	}
    	return true;
    }
}