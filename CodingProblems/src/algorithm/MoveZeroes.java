package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		moveZeroes(nums);
		
		for (int n : nums) {
			System.out.print(n + ", ");
		}
	}

    public static void moveZeroes(int[] nums) {
    	Queue<Integer> queue = new LinkedList<>();
    	int zeroCount = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) {
    			zeroCount++;
    			queue.add(i);
    			continue;
    		}
    		
    		if (queue.size() > 0) {
        		int idx = queue.poll();
        		nums[idx] = nums[i];
        		queue.add(i);
    		}
    	}
    	
    	for (int i = nums.length - zeroCount; i < nums.length; i++) {
    		nums[i] = 0;
    	}
    }
}
