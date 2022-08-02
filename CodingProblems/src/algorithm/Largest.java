package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Largest {
	
	public static void main(String[] args) {
		int[] nums = {10, 2};
		int[] nums2 = {3, 30, 34, 5, 9};
		
		Largest largest = new Largest();
		String res = largest.largestNumber(nums2);
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
    	return sb.toString();
    }
	
	class LargestComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer a, Integer b) {
			String strA = a.toString();
			String strB = b.toString();
			
			for (int i = 0, idx1 = 0, idx2 = 0; i < Math.max(strA.length(), strB.length()); i++) {
				char aChar = strA.charAt(idx1);
				char bChar = strB.charAt(idx2);
				
				if (aChar > bChar) {
					return -1;
				}
				
				if (aChar < bChar) {
					return 1;
				}
				
				if (idx1 + 1 < strA.length()) {
					idx1++;
				}
				
				if (idx2 + 1 < strB.length()) {
					idx2++;
				}
			}
			return 0;
		}
	}
}
