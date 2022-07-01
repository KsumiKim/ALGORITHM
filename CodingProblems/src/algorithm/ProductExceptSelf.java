package algorithm;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		int[] res = productExceptSelf(nums);
		for (int n : res)
			System.out.print(n + ", ");
	}
	
    public static int[] productExceptSelf(int[] nums) {
    	int product = 1;
    	
    	for (int n : nums) {
    		product *= n;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		nums[i] = product / nums[i];
    	}
    	return nums;
    }
}
