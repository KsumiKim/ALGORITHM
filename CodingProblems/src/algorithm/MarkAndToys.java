package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {

	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(1, 2, 3, 4);
		int k = 7;

		List<Integer> prices2 = Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
		int k2 = 50;
		
		int res = maximumToys(prices2, k2);
		System.out.println(res);
	}
	
    public static int maximumToys(List<Integer> prices, int k) {
    	Collections.sort(prices);
    	int toysCount = 0;
    	
    	for (int i = 0; i < prices.size(); i++) {
    		if (k - prices.get(i) < 0) {
    			break;
    		}
    		k -= prices.get(i);
    		toysCount++;
    	}
    	return toysCount;
    }

}
