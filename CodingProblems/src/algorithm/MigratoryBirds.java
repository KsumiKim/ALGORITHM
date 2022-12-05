package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3);
		List<Integer> arr2 = Arrays.asList(1, 4, 4, 4, 5, 3);
		List<Integer> arr3 = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		
		int res = migratoryBirds(arr3);
		System.out.println(res);
	}
	
    public static int migratoryBirds(List<Integer> arr) {
    	Map<Integer, Integer> map = new TreeMap<>();
    	
    	for (int n : arr) {
    		map.put(n, map.getOrDefault(n, 0) + 1);
    	}
    	
    	int max = 0, maxNum = 0;
    	
    	for (int key : map.keySet()) {
    		int count = map.get(key);
    		
    		if (count > max) {
    			max = count;
    			maxNum = key;
    		}
    	}
    	
    	return maxNum;
    }

}
