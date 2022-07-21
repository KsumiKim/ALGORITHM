package algorithm;

public class HouseRobber {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int[] nums2 = {2,7,9,3,1};
		
		int res = rob(nums2);
		System.out.println(res);
	}

    public static int rob(int[] nums) {
    	int odd = 0, even = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (i % 2 == 0) {
    			even += nums[i];
    		} else {
    			odd += nums[i];
    		}
    	}
    	return Math.max(odd, even);
    }
}
