package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuddyString {
	
	public static void main(String[] args) {
		String s = "aa";
		String goal = "aa";
		
		boolean res = buddyStrings(s, goal);
		System.out.println(res);
	}
	
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
        	return false;
        }
        
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
            	set.add(c);
            }
        	return set.size() < s.length();
        }
        
        List<Integer> diffIdxList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) != goal.charAt(i)) {
        		diffIdxList.add(i);
        	}
        }
		
    	return diffIdxList.size() == 2 && s.charAt(diffIdxList.get(1)) == goal.charAt(diffIdxList.get(0)) && s.charAt(diffIdxList.get(0)) == goal.charAt(diffIdxList.get(1));
    }
}
