package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Largest {
	
	public static void main(String[] args) {
		int[] nums = {10, 2};
		int[] nums2 = {3, 30, 34, 5, 9};
		int[] nums3 = {34323, 3432};
		
		Largest largest = new Largest();
		String res = largest.largestNumber(nums3);
		System.out.println(res);
	}
    
	public String largestNumber(int[] nums) {
		List<Integer> list = new ArrayList<>();
		for (int n : nums) {
			list.add(n);
		}
		
		Collections.sort(list, new LargestComparator());
		StringBuilder sb = new StringBuilder();
		
		for (int n : list) {
			sb.append(n);
		}
		
    	return onlyZero(sb.toString()) ? "0" : sb.toString();
    }
	
	private boolean onlyZero(String numStr) {
		
		for (char c : numStr.toCharArray()) {
			if (c != '0') {
				return false;
			}
		}
		return true;
	}
	
	class LargestComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer a, Integer b) {
			StringBuilder ab = new StringBuilder(a.toString() + b.toString());
			StringBuilder ba = new StringBuilder(b.toString() + a.toString());
			
			for (int i = 0; i < ab.length(); i++) {
				char aChar = ab.charAt(i);
				char bChar = ba.charAt(i);
				
				if (aChar > bChar) {
					return -1;
				}
				
				if (aChar < bChar) {
					return 1;
				}
			}
			return 0;
		}
	}
}
