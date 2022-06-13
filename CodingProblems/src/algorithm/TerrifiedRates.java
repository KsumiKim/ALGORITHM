package algorithm;

import java.util.Arrays;

public class TerrifiedRates {
	
	public static void main(String[] args) {
		int[] rates = {2, 3, 1, 2, 2};
		int res = getMaxNumberOfGroupToForm(rates);
		System.out.println(res);
	}
	
	public static int getMaxNumberOfGroupToForm(int[] rates) {
		Arrays.sort(rates);
		int max = 0, count = 0;
		
		for (int i = 0; i < rates.length; i++) {
			count++;
			if (count >= rates[i]) {
				count = 0;
				max++;
			}
		}
		return max;
	}

}
