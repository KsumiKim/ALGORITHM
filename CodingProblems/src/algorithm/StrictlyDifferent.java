package algorithm;

public class StrictlyDifferent {

	public static void main(String[] args) {
		int[] nums = {11, 7, 2, 15};
		int[] nums2 = {-3, 3, 3, 90};
		
		int res = countElements(nums2);
		System.out.println(res);
	}
	
    public static int countElements(int[] nums) {
    	int count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		int curr = nums[i];
    		boolean greater = false, smaller = false;
    		
    		for (int j = 0; j < nums.length; j++) {
    			if (i == j) {
    				continue;
    			}
    			if (nums[j] > curr) {
    				greater = true;
    			}
    			if (nums[j] < curr) {
    				smaller = true;
    			}
    		}
    		if (greater && smaller) {
    			count++;
    		}
    	}
    	return count;
    }
}
