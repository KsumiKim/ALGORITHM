package algorithm;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;

		int[] coins2 = {2};
		int amount2 = 3;

		int[] coins3 = {1};
		int amount3 = 0;
		
		int res = coinChange(coins3, amount3);
		System.out.println(res);
	}
    
	public static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int count = 0;
		
		for (int i = coins.length - 1; i >= 0;) {
			if (amount >= coins[i]) {
				amount -= coins[i];
				count++;
			} else {
				i--;
			}
		}
    	return amount == 0 ? count : -1;
    }

}
