package algorithm;

import java.util.Arrays;
import java.util.List;

public class SumPair {

	public static void main(String[] args) {
		int k = 3;
		List<Integer> list = Arrays.asList(1, 3, 2, 6, 1, 2);
		
		int res = divisibleSumPairs(k, list);
		System.out.println(res);
	}
	
    public static int divisibleSumPairs(int k, List<Integer> list) {
    	int divisibleCount = 0;
    	
    	for (int i = 0; i < list.size(); i++) {
    		for (int j = i + 1; j < list.size(); j++) {
    			int sum = list.get(i) + list.get(j);

    			if (k % sum == 0) {
    				divisibleCount++;
    			}
    		}
    	}
    	return divisibleCount;
    }

}
