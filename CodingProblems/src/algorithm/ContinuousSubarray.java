package algorithm;

public class ContinuousSubarray {
	
	public static void main(String[] args) {
		int[] nums = {23,2,4,6,7};
		int k = 6;
		
		int[] nums2 = {23,2,6,4,7};
		int k2 = 6;
		
		int[] nums3 = {23,2,6,4,7};
		int k3 = 13;
		
		boolean res = checkSubarraySum(nums3, k3);
		System.out.println(res);
	}
	
    public static boolean checkSubarraySum(int[] nums, int k) {
    	
    	for (int i = 0; i < nums.length; i++) {
    		int curr = nums[i];
    		
    		for (int j = i + 1; j < nums.length; j++) {
    			curr += nums[j];
    			
    			if (curr % k == 0) {
    				return true;
    			}
    		}
    	}
    	
    	return false;
    }
}
