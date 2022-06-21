package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberFinder {
	
	public static void main(String[] args) {
		String numbers = "17";
		String numbers2 = "011";
		
		getPrimeNumber(numbers2);
	}
	
	public static int getPrimeNumber(String numbers) {
		List<String> list = new ArrayList<>();
		char[] charArr = numbers.toCharArray();
		Arrays.sort(charArr);
		
		backtrack(charArr, list, new StringBuilder(), 0);
		System.out.println(list);
		return 0;
	}
	
	private static void backtrack(char[] numbers, List<String> list, StringBuilder sb, int idx) {
		list.add(sb.toString());
		
		for (int i = idx; i < numbers.length; i++) {
			if (i > idx && numbers[i] == numbers[i - 1]) {
				continue;
			} 
			sb.append(numbers[i]);
			backtrack(numbers, list, sb, idx + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
