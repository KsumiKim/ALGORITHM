package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gemstones {
	
	public static void main(String[] args) {
		List<String> arr = Arrays.asList("abcdde", "baccd", "eeabg");
		int res = gemstones(arr);
		System.out.println(res);
	}

    public static int gemstones(List<String> arr) {
    	int[] words = new int[26];
    	int gemstonesCount = 0;
    	
    	for (String str : arr) {
    		Set<Character> set = new HashSet<>();
    		
    		for (int i = 0; i < str.length(); i++) {
    			set.add(str.charAt(i));
    		}
    		
    		for (char c : set) {
    			words[c - 97]++;
    		}
    	}
    	
    	for (int n : words) {
    		if (n >= arr.size()) {
    			gemstonesCount++;
    		}
    	}
    	return gemstonesCount;
    }
}
