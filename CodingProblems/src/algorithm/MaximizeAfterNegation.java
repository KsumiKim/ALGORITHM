package algorithm;

import java.util.PriorityQueue;

public class MaximizeAfterNegation {
	
	public static void main(String[] args) {
		int[] nums = {4, 2, 3};
		int k = 1;
		
		int[] nums2 = {3, -1, 0, 2};
		int k2 = 3;
		
		int[] nums3 = {2, -3, -1, 5,- 4};
		int k3 = 2;
		
		int sum = largestSumAfterKNegations(nums3, k3);
		System.out.println(sum);
	}

    public static int largestSumAfterKNegations(int[] nums, int k) {
    	PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
    	int sum = 0;
    	
    	for (int n : nums) {
			queue.add(n);
			sum += n;
		}
		
    	while (k-- > 0) {
    		int min = queue.poll();
    		queue.add(min * -1);
    		sum -= min * 2;
    	}
    	
    	return sum;
    }
}
