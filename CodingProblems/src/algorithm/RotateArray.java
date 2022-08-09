package algorithm;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;

		int[] nums2 = {-1, -100, 3, 99};
		int k2 = 2;

		rotate(nums2, k2);
		
		for (int n : nums2) {
			System.out.print(n + ", ");
		}
	}
	
    public static void rotate(int[] nums, int k) {
    	int[] arr = new int[nums.length];
    	
    	for (int i = 0; i < nums.length; i++) {
    		arr[i] = nums[i];
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		nums[(i + k) % nums.length] = arr[i];
    	}
    }

}
