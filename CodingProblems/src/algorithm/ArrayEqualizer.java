package algorithm;

import java.util.Arrays;
import java.util.List;

public class ArrayEqualizer {
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3, 3, 2, 1, 3);
		int res = equalizeArray(arr);
		System.out.println(res);
	}

    public static int equalizeArray(List<Integer> arr) {
    	int[] nums = new int[101];
    	
    	for (int n : arr) {
    		nums[n]++;
    	}
    	
    	int maxCount = 0, max = 0, count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] > maxCount) {
    			maxCount = nums[i];
    			max = i;
    		}
    	}
    	
    	for (int n : nums) {
    		if (n != 0 && n != max) {
    			count++;
    		}
    	}
    	return count;
    }
}
