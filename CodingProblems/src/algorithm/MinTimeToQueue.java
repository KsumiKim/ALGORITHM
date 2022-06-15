package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MinTimeToQueue {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] times = new int[n];
		
		for (int i = 0; i < n; i++) {
			times[i] = in.nextInt();
		}
		
		Arrays.sort(times);
		int[] nums = new int[n + 1];
		int minTime = 0;
		
		for (int i = 1; i <= times.length; i++) {
			nums[i] += times[i - 1] + nums[i - 1];
			minTime += nums[i];
		}
		System.out.println(minTime);
	}

	public static int getMinTime(int n, int[] times) {
		Arrays.sort(times);
		int[] nums = new int[n + 1];
		int minTime = 0;
		
		for (int i = 1; i <= times.length; i++) {
			nums[i] += times[i - 1] + nums[i - 1];
			minTime += nums[i];
		}
		return minTime;
	}
	
}
