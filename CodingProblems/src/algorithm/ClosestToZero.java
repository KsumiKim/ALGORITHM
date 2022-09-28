package algorithm;

public class ClosestToZero {
	
	public static void main(String[] args) {
		int[] nums = {-4,-2,1,4,8};
		
		int res = findClosestNumber(nums);
		System.out.println(res);
	}

    public static int findClosestNumber(int[] nums) {
    	int min = Integer.MAX_VALUE, closest = 0;
    	
    	for (int n : nums) {
    		int num = Math.abs(n);
    		
    		if (min > num) {
    			min = num;
    			closest = n;
    		} else if (min == num) {

    			if (closest < n) {
         			closest = n;
    			}
    		}
    	}
    	return closest;
    }

}
