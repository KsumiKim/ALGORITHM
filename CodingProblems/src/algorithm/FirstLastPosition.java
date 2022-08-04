package algorithm;

public class FirstLastPosition {
	
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;

		int[] nums2 = {5,7,7,8,8,10};
		int target2 = 6;

		int[] nums3 = {};
		int target3 = 0;
		
		int[] res = searchRange(nums2, target2);
		System.out.println(res[0] + ", " + res[1]);
	}
    
	public static int[] searchRange(int[] nums, int target) {
		int count = 0;
		int[] res = {-1, -1};
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				if (res[0] == -1) {
					res[0] = i;
				}
				count++;
			}
		}
		if (res[0] != -1) {
			res[1] = res[0] + count - 1;
		}
    	return res;
    }

}
