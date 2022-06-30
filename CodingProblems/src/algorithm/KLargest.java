package algorithm;

import java.util.Arrays;

public class KLargest {
	
	public static void main(String[] args) {
		int[] nums = {3, 2, 1, 5, 6, 4};
		int k = 2;
		
		int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
		int k2 = 4;
		
		
		int res = findKthLargest(nums2, k2);
		System.out.println(res);
		
	}

    public static int findKthLargest(int[] nums, int k) {
    	Arrays.sort(nums);
    	return nums[nums.length - k];
    }
}
