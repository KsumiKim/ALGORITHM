package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {
	
	public static void main(String[] args) {
		int[] arr = {4, 6, 5, 3, 3, 1};
		int res = pickingNumbers(arr);
		System.out.println(res);
	}

    public static int pickingNumbers(int[] arr) {
    	Arrays.sort(arr);
    	
    	int curr = arr[0], maxLength = 1;
    	List<Integer> nums = new ArrayList<>();
    	
    	for (int i = 1; i < arr.length; i++) {
    		if (curr == arr[i] || curr + 1 == arr[i]) {
    			maxLength++;
    		} else {
    			nums.add(maxLength);
    			curr = arr[i];
    			maxLength = 1;
    		}
    	}
    	Collections.sort(nums);
    	return nums.get(nums.size() - 1);
    }

}
