package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		int k = 3;
		
		int[] nums2 = {1, 0, 1, 1};
		int k2 = 1;
		
		int[] nums3 = {1, 2, 3, 1, 2, 3};
		int k3 = 2;
		
		boolean res = containsNearbyDuplicate(nums2, k2);
		System.out.println(res);
	}

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
    	Map<Integer, List<Integer>> valueMap = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		List<Integer> idxList;
    		if (valueMap.containsKey(nums[i])) {
    			idxList = valueMap.get(nums[i]);
    			idxList.add(i);
    			
    			if (lessThanK(idxList, k)) {
    				return true;
    			}
    		} else {
    			idxList = new ArrayList<>();
    			idxList.add(i);
    			valueMap.put(nums[i], idxList);
    		}
    	}
    	return false;
    }
    
    private static boolean lessThanK(List<Integer> idxList, int k) {
    	
    	for (int i = 0; i < idxList.size(); i++) {
    		
    		for (int j = i + 1; j < idxList.size(); j++) {
    			if (Math.abs(idxList.get(i) - idxList.get(j)) <= k) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
}
