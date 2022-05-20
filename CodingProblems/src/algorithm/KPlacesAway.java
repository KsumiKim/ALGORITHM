package algorithm;

public class KPlacesAway {
	
	public static void main(String[] args) {
		int[] nums = {1,0,0,0,1,0,0,1};
		int k = 2;
		
		int[] nums2 = {1,0,0,1,0,1};
		int k2 = 2;
		
		boolean res = kLengthApart(nums, k);
		System.out.println(res);
	}
	
	public static boolean kLengthApart(int[] nums, int k) {
		int prevIdx = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				
				if (prevIdx < 0) {
					prevIdx = i;
					continue;
				}
				
				if (i - prevIdx - 1 < k) {
					return false;
				}
				prevIdx = i;
			}
		}
		return true;
    }
}
