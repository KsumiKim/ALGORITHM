package algorithm;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		int[] nums2 = {3,1,3,4,2};
		
		int res = findDuplicate(nums2);
		System.out.println(res);
	}
	
    public static int findDuplicate(int[] nums) {
    	int[] arr = new int[nums.length];
    	int duplicate = 0;
    	
    	for (int n : nums) {
    		if (arr[n] > 0) {
    			duplicate = n;
    			break;
    		}
    		arr[n]++;
    	}
    	return duplicate;
    }

}
