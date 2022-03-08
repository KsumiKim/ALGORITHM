package algorithm;

public class PivotIndex {
	
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		int[] nums2 = {1,2,3};
		int[] nums3 = {2,1,-1};
		
		int res = pivotIndex(nums3);
		System.out.println(res);
	}
	
    public static int pivotIndex(int[] nums) {
    	int left = 0, right = 0;
    	
    	for (int n : nums) {
    		right += n;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		right -= nums[i];
    		if (left == right) {
    			return i;
    		}
    		left += nums[i];
    	}
    	return -1;
    }
}
