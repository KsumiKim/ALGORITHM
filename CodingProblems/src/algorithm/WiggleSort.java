package algorithm;

import java.util.Arrays;

public class WiggleSort {
	
	public static void main(String[] args) {
		int[] nums = {1, 5, 1, 1, 6, 4};
		int[] nums2 = {1, 3, 2, 2, 3, 1};
		int[] nums3 = {1, 1, 2, 1, 2, 2, 1};
		wiggleSort(nums3);
		
		for (int n : nums3) {
			System.out.print(n + ", ");
		}
	}
	
    public static void wiggleSort(int[] nums) {
    	boolean even = nums.length % 2 == 0;
    	int[] largest = new int[nums.length / 2];
    	int[] smallest = new int[nums.length / 2 + (even ? 0 : 1)];
    	
    	Arrays.sort(nums);
    	
    	for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
    		if (i < (nums.length / 2) || !even && i == (nums.length / 2)) {
        		smallest[j++] = nums[i];
    		} else {
        		largest[k++] = nums[i];
    		}
    	}
    	
    	for (int i = 0, j = 0, k = 0; i < nums.length; i++) {
    		if (i % 2 == 0) {
    			nums[i] = smallest[j++];
    		} else {
    			nums[i] = largest[k++];
    		}
    	}
    }

}
