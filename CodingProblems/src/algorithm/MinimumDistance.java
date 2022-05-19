package algorithm;

public class MinimumDistance {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int target = 5, start = 3;
		
		int res = getMinDistance(nums, target, start);
		System.out.println(res);
	}

    public static int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < nums.length; i++) {
			
    		if (nums[i] == target) {
	    		int value = Math.abs(i - start);
	    		min = Math.min(value, min);
			}
    	}
    	return min;
    }
}
