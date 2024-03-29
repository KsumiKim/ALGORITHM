package algorithm;

public class ArrayFromPermutation {
	
	public static void main(String[] args) {
		int[] nums = {0, 2, 1, 5, 3, 4};
		int[] nums2 = {5, 0, 1, 2, 3, 4};
		int[] res = buildArray(nums2);
		for (int n : res) {
			System.out.print(n + ", ");
		}
	}
    
	public static int[] buildArray(int[] nums) {
		int[] res = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			res[i] = nums[nums[i]];
		}
    	return res;
    }

}
