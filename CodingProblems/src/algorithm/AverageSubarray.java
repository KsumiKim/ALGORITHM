package algorithm;

public class AverageSubarray {

	public static void main(String[] args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		
		double res = findMaxAverage(nums, k);
		System.out.println(res);
	}
	
    public static double findMaxAverage(int[] nums, int k) {
    	int idx = 0;
    	double maxAvg = 0;
    	
    	while (nums.length - idx > k) {
    		double sum = 0;
    		
    		for (int i = idx; i < idx + k; i++) {
    			sum += nums[i];
    		}
    		maxAvg = Math.max(maxAvg, sum / k);
    		idx++;
    	}
    	
    	return maxAvg;
    }
}
