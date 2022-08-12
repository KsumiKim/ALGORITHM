package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumThree {
	
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int[] nums2 = {0, 1, 1};
		int[] nums3 = {0, 0, 0};
		
		List<List<Integer>> result = threeSum(nums3);
		System.out.println(result);
	}

    public static List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = i + 1; j < nums.length; j++) {
    			
    			for (int k = j + 1; k < nums.length; k++) {
    				
        			if (nums[i] + nums[j] + nums[k] == 0) {
        				List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
        				Collections.sort(list);
        				if (!result.contains(list)) {
                			result.add(list);
        				}
        			}
    			}
    		}
    	}
    	return result;
    }
}
