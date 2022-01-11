package algorithm;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat dog dog";
		
		String pattern2 = "abba";
		String str2 = "dog cat cat fish";

		String pattern3 = "aaaa";
		String str3 = "dog cat cat dog";

		String pattern4 = "abba";
		String str4 = "dog cat cat dog";
		
		System.out.println(wordPattern(pattern4, str4));
	}
	
	public static boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();
		String[] words = s.split(" ");
		
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			
			if (map.containsKey(c)) {
				if (!map.get(c).equals(words[i])) {
					return false;
				}
			} else {
				map.put(c, words[i]);
			}
		}
		return true;
	}
}
