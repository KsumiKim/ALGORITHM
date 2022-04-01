package algorithm;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		MaxConsecutiveOnes maxOnes = new MaxConsecutiveOnes();
		int[] nums = {1, 1, 0, 1, 1, 1};
		int[] nums2 = {1, 0, 1, 1, 0, 1};
		int result = maxOnes.findMaxConsecutiveOnes(nums2);
		
		System.out.println(result);
		
	}
	
	public int getMaxConsOnes(int[] nums) {
		int max = 0;
		int oneCount = 0;
		
		for (int n : nums) {
			max = Math.max(max, oneCount = n == 0 ? 0 : ++oneCount);
		}
		
		return max;
	}


    public int findMaxConsecutiveOnes(int[] nums) {
    	int res = 0, max = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] != 1) {
    			res = Math.max(res, max);
    			max = 0;
    			continue;
    		}
    		max++;
    	}
    	
    	return Math.max(res, max);
    }
}
