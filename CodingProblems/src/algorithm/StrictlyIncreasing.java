package algorithm;

public class StrictlyIncreasing {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 10, 5, 7};
		int[] nums2 = {2, 3, 1, 2};
		int[] nums3 = {1, 1, 1};
		int[] nums4 = {2, 1};
		int[] nums5 = {100, 21, 3};
		
		boolean res = canBeIncreasing(nums5);
		System.out.println(res);
	}
	
    public static boolean canBeIncreasing(int[] nums) {
    	boolean increasing = true;
    	int prev = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (nums[i] <= prev) {
    			
    			if (!increasing) {
    				return increasing;
    			}
    			increasing = false;
    			prev = i >= 2 ? nums[i - 2] : nums[i];
    			continue;
    		}
    		prev = nums[i];
    	}
    	return true;
    }
    
}
