package algorithm;

import java.util.Stack;

public class ReverseVowel {
	
	public static void main(String[] args) {
		String s = "hello";
		String s2 = "leetcode";
		String s3 = "aA";
		String s4 = "A man, a plan, a canal -- Panama";
		
		String res = reverseVowels(s4);
		System.out.println(res);
	}
    
    public static String reverseVowels(String s) {
    	Stack<Character> stack = new Stack<>();
    	boolean[] flags = new boolean[s.length()];
    	StringBuilder sb = new StringBuilder(s);
    	
    	for (int i = 0; i < s.length(); i++) {
    		char lowercased = Character.toLowerCase(sb.charAt(i));
    		if (lowercased == 'a' || lowercased == 'e' || lowercased == 'i' || lowercased == 'o' || lowercased == 'u') {
    			stack.push(sb.charAt(i));
    			flags[i] = true;
    		}
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (flags[i] && !stack.isEmpty()) {
    			sb.setCharAt(i, stack.pop());
    		}
    	}
    	
    	return sb.toString();
    }
}
