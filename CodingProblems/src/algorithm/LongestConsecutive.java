package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		
		int maxConsecutive = longestConsecutive(nums2);
		System.out.println(maxConsecutive);
	}

    public static int longestConsecutive(int[] nums) {
    	if (nums.length == 0) {
    		return 0;
    	}
    	
    	Set<Integer> set = new HashSet<>();
    	for (int n : nums) {
    		set.add(n);
    	}
    	
    	Integer[] arr = set.toArray(new Integer[set.size()]);
    	Arrays.sort(arr);
    	
    	int count = 1, max = 0;
    	
    	for (int i = 0; i < arr.length - 1; i++) {
    		if (arr[i] + 1 == arr[i + 1]) {
    			count++;
    		} else {
    			max = Math.max(max, count);
    			count = 1;
    		}
    	}	
    	max = Math.max(max, count);
    	return max;
    }
}
