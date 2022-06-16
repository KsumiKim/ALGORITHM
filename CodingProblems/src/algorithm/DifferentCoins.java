package algorithm;

import java.util.Scanner;

public class DifferentCoins {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int money = in.nextInt();
		
		int[] coins = new int[n];
		
		for (int i = 0; i < n; i++) {
			coins[i] = in.nextInt();
		}
		int count = 0, idx = coins.length - 1;
		
		while (money > 0 && idx >= 0) {
			if (coins[idx] <= money) {
				count += money / coins[idx];
				money %= coins[idx];
			}
			idx--;
		}
		System.out.println(count);
	}

}
