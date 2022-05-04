package algorithm;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] A = {1, 2, 4, 5};
		int[] A2 = {1, 2, 2, 3};
		int[] A3 = {6, 5, 4, 4};
		int[] A4 = {1, 3, 2};
		
		MonotonicArray mArray = new MonotonicArray();
		boolean res = mArray.isMonotonic(A3);
		System.out.println(res);
	}
	
	// An array is monotonic if it is either monotone increasing or decreasing
    public boolean isMonotonic(int[] nums) {
    	if (nums.length == 1) {
    		return true;
    	}
    	
    	boolean increasing = true, decreasing = true;
    	
    	for (int i = 0; i < nums.length - 1; i++) {
    		
    		if (increasing && decreasing) {
        		if (nums[i] < nums[i + 1]) {
        			decreasing = false;
        		} else if (nums[i] > nums[i + 1]) {
        			increasing = false;
        		}
    		}
    		
    		if ((increasing && nums[i] > nums[i + 1]) || (decreasing && nums[i] < nums[i + 1])) {
    			return false;
    		}
    	}
    	return true;
    }
}
