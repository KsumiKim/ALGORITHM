package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Largest {
	
	public static void main(String[] args) {
		int[] nums = {10, 2};
		Largest largest = new Largest();
		largest.largestNumber(nums);
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
			while (a >= 10 || b >= 10) {
				int num1 = 0, num2 = 0;
				
				if (a >= 10) {
					num1 = a / 10;
				} else {
					num1 = a % 10;	
				}
				
				if (b >= 10) {
					num2 = b / 10;
				} else {
					num2 = b % 10;	
				}
				
				if (num1 > num2) {
					return -1;
				}
				
				if (num1 < num2) {
					return 1;
				}
				a /= 10;
				b /= 10;
			}
			
			return 0;
		}
		
	}
}
