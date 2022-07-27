package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Palindromic {
	
	public static void main(String[] args) {
		String s = "abc";
		String s2 = "aaa";
		
		int size = countSubstrings(s2);
		System.out.println(size);
	}
    
	public static int countSubstrings(String s) {
        List<String> list = new ArrayList<>();
        helper(list, new StringBuilder(), s, -1, 0);
        System.out.println(list);
    	return list.size();
    }

	private static void helper(List<String> list, StringBuilder sb, String s, int prev, int idx) {
		String original = sb.toString();
		if (original.length() > 0 && original.equals(sb.reverse().toString())) {
			list.add(original);
		}
		
		if (sb.length() == s.length()) {
			return;
		}
		
		for (int i = idx; i < s.length(); i++) {
			sb.append(s.charAt(i));
			helper(list, sb, s, i, i + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
