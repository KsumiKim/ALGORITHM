package algorithm;

public class NumArray {
	
	public static void main(String[] args) {
		int[] nums = {-2, 0, 3, -5, 2, -1};
	}

	private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
    	int sum = 0;
    	
    	for (int i = left; i <= right; i++) {
    		sum += nums[i];
    	}
    	return sum;
    }
}
