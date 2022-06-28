package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KFrequent {
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k = 2;
		
		int[] res = topKFrequent(nums, k);
		for (int n : res)
			System.out.print(n + ", ");
	}
	
    public static int[] topKFrequent(int[] nums, int k) {
    	Arrays.sort(nums);
    	
    	List<Integer> list = new ArrayList<>();
    	int count = 0;
    	
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i] == nums[i - 1]) {
    			count++;
    		} else {
    			if (count >= k) {
        			list.add(nums[i - 1]);
    			}
    		}
    	}
    	
    	int[] arr = new int[list.size()];
    	for (int i = 0; i < arr.length; i++) {
    		arr[i] = list.get(i);
    	}
    
    	return arr;
    }
}
