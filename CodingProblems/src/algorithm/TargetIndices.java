package algorithm;

import java.util.ArrayList;
import java.util.List;

public class TargetIndices {
	
	public static void main(String[] args) {
		int[] nums = {1,2,5,2,3};
		int target = 5;
		
		int[] nums2 = {1,2,5,2,3};
		int target2 = 3;
		
		
		List<Integer> list = targetIndices(nums2, target2);
		System.out.println(list);
	}

    public static List<Integer> targetIndices(int[] nums, int target) {
    	List<Integer> list = new ArrayList<>();
    	int countNumsLessThanTarget = 0;
    	int countTarget = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] < target) {
    			countNumsLessThanTarget++;
    		} else if (nums[i] == target) {
    			countTarget++;
    		}
    	}
    	for (int i = countNumsLessThanTarget; i < countTarget + countNumsLessThanTarget; i++) {
    		list.add(i);
    	}
    	return list;
    }

}
