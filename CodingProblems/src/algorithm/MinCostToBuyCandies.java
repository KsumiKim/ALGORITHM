package algorithm;

import java.util.Arrays;

public class MinCostToBuyCandies {

	public static void main(String[] args) {
		int[] cost = {1, 2, 3};
		int[] cost2 = {6, 5, 7, 9, 2, 2};
		int[] cost3 = {5, 5};
		int[] cost4 = {1};
		int[] cost5 = {3, 3, 3, 1};
		
		
		int res = minimumCost(cost5);
		System.out.println(res);
	}
	
    public static int minimumCost(int[] cost) {
    	Arrays.sort(cost);
    	int minCost = 0;
    	int candyCount = 0;
    	
    	for (int i = cost.length - 1; i >= 0; i--) {
    		if (candyCount == 2) {
    			candyCount = 0;
    			continue;
    		}
    		minCost += cost[i];
    		candyCount++;
    	}
    	return minCost;
    }
}
