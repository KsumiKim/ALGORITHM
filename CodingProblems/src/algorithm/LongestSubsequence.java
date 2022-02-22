package algorithm;

public class LongestSubsequence {

    public int findLengthOfLCIS(int[] nums) {
    	int count = 1;
    	
    	for (int i = 1; i < nums.length; i++) {
    		if (nums[i - 1] < nums[i]) {
    			count++;
    		} else {
    			count = 1;
    		}
    	}
    	
    	return count;
    }
}
