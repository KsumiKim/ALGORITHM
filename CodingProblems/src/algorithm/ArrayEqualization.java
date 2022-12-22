package algorithm;

import java.util.Arrays;
import java.util.List;

public class ArrayEqualization {
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(3, 3, 2, 1, 3);
		List<Integer> arr2 = Arrays.asList(1, 2, 2, 3);
		int res = equalizeArray(arr2);
		System.out.println(res);
	}
	

    public static int equalizeArray(List<Integer> arr) {
    	int[] nums = new int[101];
    	
    	for (int i = 0; i < arr.size(); i++) {
    		nums[arr.get(i)]++;
    	}
    	int max = 0, lessNumberCount = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] > max) {
    			max = i;
    		}
    	}
    	
    	for (int i = 0; i < arr.size(); i++) {
    		if (nums[arr.get(i)] != max) {
    			lessNumberCount++;
    		}
    	}
    	return lessNumberCount;
    }
}
