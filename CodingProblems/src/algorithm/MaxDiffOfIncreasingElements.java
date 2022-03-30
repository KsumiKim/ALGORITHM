package algorithm;

public class MaxDiffOfIncreasingElements {
	
	public static void main(String[] args) {
		int[] nums = {7, 1, 5, 4};
		int[] nums2 = {9, 4, 3, 2};
		int[] nums3 = {1, 5, 2, 10};
		
		int res = maximumDifference(nums3);
		System.out.println(res);
	}
	
    public static int maximumDifference(int[] nums) {
    	int max = -1;
    	
    	for (int i = 0; i < nums.length; i++) {
    		int maxDiff = Integer.MIN_VALUE;
    		
    		for (int j = i + 1; j < nums.length; j++) {
    			if (nums[i] >= nums[j]) {
    				continue;
    			}
    			
    			int diff = nums[j] - nums[i];
    			if (diff > maxDiff) {
    				maxDiff = diff;
    			}
    		}
    		if (maxDiff > max) {
				max = maxDiff;
			}
		}
    	return max;
    }
}
