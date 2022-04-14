package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		String ransomeNote = "a";
		String magazine = "b";
		
		String ransomeNote2 = "aa";
		String magazine2 = "ab";
		
		System.out.println(canConstruct3(ransomeNote2, magazine2));
	}
	
	// #1 : using map to store frequency
	public static boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < magazine.length(); i++) {
			int count = map.getOrDefault(magazine.charAt(i), 0);
			map.put(magazine.charAt(i), ++count);
		}
		
		for (int i = 0; i < ransomNote.length(); i++) {
			
			// if map doesn't contain a letter of note, return false
			if (!map.containsKey(ransomNote.charAt(i)))
				return false;

			// if map contains, put the same letter and deduct its count by one
			map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
			
			// if a letter in note occurs more than in map, return false
			if (map.get(ransomNote.charAt(i)) < 0)
				return false;
		}
		
		// otherwise return true
		return true;
	}

	
	// #2: int array to store frequency of ransomNote 
	public static boolean canConstruct2(String ransomNote, String magazine) {
        // both strings only contain lowercase letters
		int[] arr = new int[26];
        
        for (char c : ransomNote.toCharArray()) 
        	arr[c - 'a']++;

        int remaining = ransomNote.length();
        
        for (char c : magazine.toCharArray()) {
        	
        	if (arr[c - 'a'] > 0) {
        		--arr[c - 'a'];
        		remaining--;
        	}
        	
        	if (remaining == 0)
        		return true;
        }
        
        return remaining == 0;
	}

    public static boolean canConstruct3(String ransomNote, String magazine) {
        StringBuilder mz = new StringBuilder(magazine);
        
        for (char c : ransomNote.toCharArray()) {
        	if (mz.indexOf(c + "") < 0) {
        		return false;
        	}
        	mz.deleteCharAt(mz.indexOf(c + ""));
        }
    	return true;
    }
}
