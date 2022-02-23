package algorithm;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		
		int[] nums3 = { 3, 3 };
		int target3 = 6;
		
		int[] res = twoSum(nums3, target3);
		
		System.out.println(res[0] + ", " + res[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		for (int j = 0; j < nums.length; j++) {
    			if (i == j)
    				continue;
    			if (nums[i] + nums[j] == target) {
    				return new int[] {i, j};
    			}
    		}
    	}
    	return null;
    }
}
