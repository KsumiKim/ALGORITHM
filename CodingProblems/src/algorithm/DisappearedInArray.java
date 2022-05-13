package algorithm;

import java.util.ArrayList;
import java.util.List;

public class DisappearedInArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
    	int[] arr = new int[nums.length];
    	List<Integer> result = new ArrayList<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		arr[nums[i] - 1]++;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (arr[i] == 0) {
    			result.add(i + 1);
    		}
    	}
    	return result;
    }
}
