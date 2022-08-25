package algorithm;

public class AbsoluteDifference {

	public static void main(String[] args) {
		int[]  nums = {1, 2, 2, 1}; 
		int k = 1;
		
		int res = countKDifference(nums, k);
		System.out.println(res);
	}
	
    public static int countKDifference(int[] nums, int k) {
    	int count = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = 0; j < nums.length; j++) {
    			if (i == j) {
    				continue;
    			}
    			if (Math.abs(nums[i] - nums[j]) == k) {
    				count++;
    			}
    		}
    	}
    	return count / 2;
    }
}
