package algorithm;

import java.util.HashSet;
import java.util.Set;

public class GreatestEnglishLetter {
	
	public static void main(String[] args) {
		String s = "lEeTcOdE";
		String s2 = "arRAzFif";
		
		
		String res = greatestLetter(s2);
		System.out.println(res);
	}

    public static String greatestLetter(String s) {
    	Set<Character> set = new HashSet<>();
    	String letter = "";
    	
    	for (char c : s.toCharArray()) {
    		if (c >= 97 && c <= 122) {
    			set.add(c);
    		}
    	}
    	
    	for (char c : s.toCharArray()) {
    		if (set.contains((char)(c + 32))) {
    			letter = c + "";
    			break;
    		}
    	}
    	return letter;
    }
}
