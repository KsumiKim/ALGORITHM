package algorithm;

public class TwiceOfOthers {

	public static void main(String[] args) {
		int[] nums = {3, 6, 1, 0};
		int[] nums2 = {1, 2, 3, 4};
		int[] nums3 = {1};
		
		int res = dominantIndex(nums3);
		System.out.println(res);
	}
	
    public static int dominantIndex(int[] nums) {
    	int largest = 0;
    	int largestIdx = 0;

    	for (int i = 0 ; i < nums.length; i++) {
    		if (largest < nums[i]) {
    			largest = nums[i];
    			largestIdx = i;
    		}
    	}

    	for (int i = 0 ; i < nums.length; i++) {
    		if (i == largestIdx)
    			continue;
    		
    		if (nums[i] * 2 > largest) {
    			return -1;
    		}
    	}
    	
    	return largestIdx;
    }
}
