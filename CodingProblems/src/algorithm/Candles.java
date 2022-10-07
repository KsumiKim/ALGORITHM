package algorithm;

import java.util.Arrays;

public class Candles {

	public static void main(String[] args) {
		int[] candles = {3, 2, 1, 3};
		int[] candles2 = {4, 4, 1, 3};
		
		int res = birthdayCakeCandles(candles2);
		System.out.println(res);
	}
	
    public static int birthdayCakeCandles(int[] candles) {
    	Arrays.sort(candles);
    	int count = 0;
    	int init = candles[candles.length - 1];
    	
    	for (int i = candles.length - 1; i >= 0; i--) {
    		if (init == candles[i]) {
    			count++;
    		} else {
    			break;
    		}
    	}
    	return count;
    }

}
