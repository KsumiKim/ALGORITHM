package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		int[] nums = {1,3,2,2,5,2,3,7};
		
		LongestHarmoniousSubsequence LHS = new LongestHarmoniousSubsequence();
		int result = LHS.findLHS2(nums);
		System.out.println(result);
	}
	
	public int findLHS(int[] nums) {

		// put all nums in map with value as its count
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int n : nums) {
			int count = map.getOrDefault(n, 0);
			map.put(n, ++count);
		}
		
		// find the length of longest subsequence
		int keyCount = 0;
		
		for (int key : map.keySet()) {
			
			if (map.containsKey(key + 1))
				keyCount = Math.max(keyCount, (map.get(key + 1) + map.get(key)));
		}
		return keyCount;
	}

	
    public int findLHS2(int[] nums) {
    	int res = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		int min = nums[i];
    		int max = nums[i];
    		List<Integer> subsequence = new ArrayList<>();
    		subsequence.add(nums[i]);
    		
    		for (int j = 0; j < nums.length; j++) {
    			if (j == i) {
    				continue;
    			}
    			
    			if (Math.abs(nums[j] - min) > 1 || Math.abs(nums[j] - max) > 1) {
    				continue;
    			}
    			
    			if (nums[j] > max) {
    				max = nums[j];
    			}
    			
    			if (nums[j] < min) {
    				min = nums[j];
    			}
    			
    			subsequence.add(nums[j]);
    		}
    		res = Math.max(res, subsequence.size());
    	}
    	return res;
    }
}
