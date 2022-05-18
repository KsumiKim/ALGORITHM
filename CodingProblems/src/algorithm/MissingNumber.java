package algorithm;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0, target = nums.length;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			target += i;
		}
		return target - sum;
    }
}
