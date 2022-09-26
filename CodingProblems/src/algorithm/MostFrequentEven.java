package algorithm;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEven {
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 2, 4, 4, 1};
		int[] nums2 = {4, 4, 4, 9, 2, 4};
		int[] nums3 = {29, 47, 21, 41, 13, 37, 25, 7};
		
		int res = mostFrequentEven(nums3);
		System.out.println(res);
	}

    public static int mostFrequentEven(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for (int n : nums) {
    		if (n % 2 == 0) {
        		map.put(n, map.getOrDefault(n, 0) + 1);
    		}
    	}
    	
    	int count = -1, num = 0;
    	for (int key : map.keySet()) {
    		
    		int freq = map.get(key);
    		if (freq > count) {
    			count = freq;
    			num = key;
    		}
    	}
    	return num == 0 ? -1 : num;
    }
}
