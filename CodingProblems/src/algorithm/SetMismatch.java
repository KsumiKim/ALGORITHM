package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

	public static void main(String[] args) {
		int[] nums = {2, 2};
		int[] nums2 = {1, 2, 2, 4};
		int[] nums3 = {1, 1};
		int[] nums4 = {2, 3, 3, 4, 5, 6};
		
		SetMismatch setMismatch = new SetMismatch();
		int[] res = setMismatch.findErrorNums4(nums4);
		
		for (int n : res)
			System.out.println(n);
		
	}
	
    public int[] findErrorNums(int[] nums) {
     
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int[] res = new int[2];
    	
    	// put everything into a map with count
    	for (int i = 0; i < nums.length; i++) {
    		
    		int count = map.getOrDefault(nums[i], 0);
    		map.put(nums[i], ++count);
    	}
    	
    	// find missing number & duplicate
    	for (int i = 1; i < nums.length + 1; i++) {
    		
    		if (map.containsKey(i)) {

    			if (map.get(i) > 1)
    				res[0] = i;
    		} else {
    			res[1] = i;
    		}
    	}
    	
    	return res;
    }
    
    // #2: Brute force 
    public int[] findErrorNums2(int[] nums) {
    	int dup = -1;
    	int missing = -1;
    	
    	for (int i = 0; i < nums.length + 1; i++) {
    		int count = 0;
    		
    		for (int j = 0; j < nums.length; j++) {
    			if (nums[j] ==i)
    				count++;
    		}
    		if (count == 2)
    			dup = i;
    		else if (count == 0)
    			missing = i;
    	}
    	
    	return new int[] {dup, missing};
    }
    
    // #3. Sorting
    public int[] findErrorNums3(int[] nums) {
    	Arrays.sort(nums);
    	
    	int dup = -1;
    	int missing = -1;
    	
    	for (int i = 1; i < nums.length; i++) {
    		
    		if (nums[i] == nums[i - 1])
    			dup = nums[i];
    		else if (nums[i] > nums[i - 1] + 1)
    			missing = nums[i - 1] + 1;
    	}
    	
    	return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

    
    public int[] findErrorNums4(int[] nums) {
    	int[] res = new int[2];
    	int max = nums.length;
    	Arrays.sort(nums);
    	Set<Integer> set = new HashSet<>();
    	
    	for (int i = 0, j = 1; i < max; i++, j++) {
    		
    		if (set.contains(nums[i])) {
        			res[0] = nums[i];
        			continue;
        		}
        		
    		set.add(nums[i]);
    		
    		if (!set.contains(j)) {
    			res[1] = j;
    		}
    		
    		if (res[0] > 0 && res[1] > 0) {
    			break;
    		}
    	}
    	
    	return res;
    }
}
