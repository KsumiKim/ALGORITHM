package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5, 4, 3, 2, 1);
		List<Integer> res = closestNumbers(arr);
		System.out.println(res);
	}
	
    public static List<Integer> closestNumbers(List<Integer> arr) {
    	Collections.sort(arr);
    	List<Integer> pairs = new ArrayList<>();
    	int minDiff = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < arr.size() - 1; i++) {
    		int diff = arr.get(i) - arr.get(i + 1);
    		if (diff <= minDiff) {
    			minDiff = diff;
    			pairs.add(arr.get(i));
    			pairs.add(arr.get(i + 1));
    		}
    	}
    	return pairs;
    }

}
