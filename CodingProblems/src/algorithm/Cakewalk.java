package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cakewalk {

	public static void main(String[] args) {
		List<Integer> calories = Arrays.asList(5, 10, 7);
		List<Integer> calories2 = Arrays.asList(7, 4, 9, 6);
		long res = marcsCakewalk(calories2);
		System.out.println(res);
	}
	
    public static long marcsCakewalk(List<Integer> calories) {
    	Collections.sort(calories);
    	long minMiles = 0;
    	
    	for (int i = calories.size() - 1, j = 0; i >= 0; i--, j++) {
    		minMiles += (long)calories.get(i) * Math.pow(2, j);
    	}
    	return minMiles;
    }

}
