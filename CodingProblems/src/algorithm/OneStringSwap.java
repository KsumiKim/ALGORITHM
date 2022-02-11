package algorithm;

import java.util.HashMap;
import java.util.Map;

public class OneStringSwap {
	
	public static void main(String[] args) {
		String s1 = "bank";
		String s2 = "kanb";
		
		String s3 = "attach";
		String s4 = "defend";
		
		String s5 = "kelb";
		String s6 = "kelb";
		
		String s7 = "aa";
		String s8 = "ac";
		
		boolean res = areAlmostEqual(s7, s8);
		System.out.println(res);
	}

    public static boolean areAlmostEqual(String s1, String s2) {
    	Map<Character, Character> map = new HashMap<>();
    	boolean swappable = true;
    	
    	for (int i = 0; i < s1.length(); i++) {
    		char char1 = s1.charAt(i);
    		char char2 = s2.charAt(i);
    		
    		if (char1 == char2) {
    			continue;
    		}
    		
    		if (!swappable) {
    			
    			if (!map.containsValue(char1)) {
    				return false;
    			}
    			
    			if (map.get(char2) != null && map.get(char2) != char1) {
    				return false;
    			}
    			map.remove(char2);
    			continue;
    		}
    		swappable = false;
    		map.put(char1, char2);
    	}
    	return map.isEmpty();
    }
}
