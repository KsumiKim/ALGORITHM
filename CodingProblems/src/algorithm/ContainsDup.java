package algorithm;

import java.util.HashSet;
import java.util.Set;

public class ContainsDup {

	public static void main(String[] args) {
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		int[] nums2 = {1,2,3,1};
		int[] nums3 = {1,2,3,4};
		boolean res = containsDuplicate(nums3);
		System.out.println(res);
	}
	
    public static boolean containsDuplicate(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	
    	for (int i = 0; i < nums.length - 1; i++) {
    		if (set.contains(nums[i])) {
    			return true;
    		}
    		set.add(nums[i]);
    	}
    	return false;
    }
}
