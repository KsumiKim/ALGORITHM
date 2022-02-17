package algorithm;

import java.util.Arrays;

public class SortedAndRotatedArray {

    public boolean check(int[] nums) {
    	int[] arr = new int[nums.length];
    	boolean increasing = nums[0] < nums[1];
    	int rotationPoint = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (i < arr.length - 1) {
    			
    			if (increasing && nums[i] > nums[i + 1]) {
        			increasing = false;
        			rotationPoint = i;	
    			} else if (!increasing && nums[i] < nums[i + 1]) {
        			increasing = true;
        			rotationPoint = i;	
    			}
    		}
    		arr[i] = nums[i];
    	}
    	Arrays.sort(arr);
    	
    	for (int i = 0; i < arr.length; i++) {
    		 if (arr[i] != nums[(i + rotationPoint) % arr.length]) {
    			 return false;
    		 }
    	}
    	return true;
    }
}
