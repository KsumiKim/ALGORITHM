package algorithm;

public class MaxProductSubarray {
	
	public static void main(String[] args) {
		int[] nums = {2, 3, -2, 4};
		int[] nums2 = {-2, 0, -1};
		
		int res = maxProduct(nums);
		System.out.println(res);
	}
	
    public static int maxProduct(int[] nums) {
    	int maxProduct = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < nums.length; i++) {
    		int product = nums[i];
			maxProduct = Math.max(product, maxProduct);
    		
    		for (int j = i + 1; j < nums.length; j++) {
    			product *= nums[j];
    			maxProduct = Math.max(product, maxProduct);
    		}
    	}
    	
    	return maxProduct;
    }

}
