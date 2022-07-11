package algorithm;

public class FindPeak {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 1};
		int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
		
		int res = findPeakElement(nums2);
		System.out.println(res);
	}
    
	public static int findPeakElement(int[] nums) {
		if (nums.length == 1) {
			return 0;
		} else if (nums.length == 2) {
			return nums[0] > nums[1] ? 0 : 1;
		}
		int peakIdx = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || i == nums.length - 1) {

				if (i == 0 && nums[i] > nums[i + 1]) {
					peakIdx = i;
					break;
				} else if (i == nums.length - 1 && nums[i - 1] < nums[i]) {
					peakIdx = i;
					break;
				}
			} else if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
				peakIdx = i;
				break;
			}
		}		
    	return peakIdx;
    }
}
