package algorithm;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {

	public static void main(String[] args) {
		int[] nums = {1,100,200,1,100};
		int key = 1;
		
		int[] nums2 = {2,2,2,2,3};
		int key2 = 2;
		
		int res = mostFrequent(nums2, key2);
		System.out.println(res);
	}
	
    public static int mostFrequent(int[] nums, int key) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int keyCount = 0;
    	
    	for (int n : nums) {
    		map.put(n, map.getOrDefault(n, 0) + 1);
    	}
    	
    	for (int k : map.keySet()) {
    		if (k == key) {
    			keyCount = map.get(k);
    		}
    	}

    	int target = 0, targetCount = keyCount;
    	
    	for (int k : map.keySet()) {
    		int count = map.get(k);
    		
    		if (count >= targetCount) {
    			target = k;
    			targetCount = count;
    		}
    	}
    	return target;
    }

}
