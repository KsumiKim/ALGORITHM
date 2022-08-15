package algorithm;

import java.util.Arrays;

public class FirstMissingPositive {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 0};
		int[] nums2 = {3, 4, -1, 1};
		int[] nums3 = {7, 8, 9, 11, 12};
		int res = firstMissingPositive(nums3);
		System.out.println(res);
	}
    
	public static int firstMissingPositive(int[] nums) {
		int min = 1;
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0) {
				continue;
			}
			
			if (nums[i] == min) {
				min++;
			}
		}
    	return min;
    }

}
