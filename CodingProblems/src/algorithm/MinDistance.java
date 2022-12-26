package algorithm;

import java.util.Arrays;
import java.util.List;

public class MinDistance {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, 2, 1, 2, 3);
		List<Integer> a2 = Arrays.asList(7, 1, 3, 4, 1, 7);
	
		int res = minimumDistances(a2);
		System.out.println(res);
	}
	
    public static int minimumDistances(List<Integer> a) {
    	int min = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < a.size(); i++) {
    		
    		for (int j = i + 1; j < a.size(); j++) {
    			if (a.get(i) == a.get(j)) {
    				min = Math.min(min, Math.abs(i - j));
    			}
    		}
    	}
    	return min;
    }

}
