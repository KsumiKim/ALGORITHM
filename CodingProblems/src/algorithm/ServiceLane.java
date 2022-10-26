package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {
	
	public static void main(String[] args) {
		List<Integer> width = Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3);
		List<List<Integer>> cases = Arrays.asList( Arrays.asList(0, 3), Arrays.asList(4, 6), Arrays.asList(6, 7), Arrays.asList(3, 5), Arrays.asList(0, 7) );
		
		List<Integer> res = serviceLane(width, cases);
		System.out.println(res);
	}
	

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
    	List<Integer> res = new ArrayList<>();
    	
    	for (List<Integer> caseList : cases) {
    		int start = caseList.get(0), end = caseList.get(1);
    		int min = Integer.MAX_VALUE;
    		
    		for (int i = start; i < end + 1; i++) {
    			min = Math.min(width.get(i), min);
    		}
			res.add(min);
    	}
    	return res;
    }
	
}
