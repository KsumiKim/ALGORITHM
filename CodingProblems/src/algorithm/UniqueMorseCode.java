package algorithm;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
	
	public static void main(String[] args) {
		String[] words = {"gin","zen","gig","msg"};
		int res = uniqueMorseRepresentations(words);
		System.out.println(res);
	}
	
    public static int uniqueMorseRepresentations(String[] words) {
    	Set<String> set = new HashSet<>();
    	
    	String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	
    	for (String word : words) {
    		StringBuilder sb = new StringBuilder();
    		for (char c : word.toCharArray()) {
    			sb.append(codes[c - 97]);
    		}
			set.add(sb.toString());
    	}
    	return set.size();
    }

}
