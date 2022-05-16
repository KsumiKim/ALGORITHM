package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Intersection {
	
	public static void main(String[] args) {
		int[][] nums = {
			{3, 1, 2, 4, 5},
			{1, 2, 3, 4},
			{3, 4, 5, 6}
		};
		
		int[][] nums2 = {
			{1, 2, 3},
			{4, 5, 6}
		};
		
		List<Integer> res = intersection(nums2);
		System.out.println(res);
	}

	public static List<Integer> intersection(int[][] nums) {
    	Map<Integer, Integer> map = new TreeMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		for (int j = 0; j < nums[i].length; j++) {
    			int value = nums[i][j]; 
    			map.put(value, map.getOrDefault(value, 0) + 1);
    		}
    	}
    	return map.keySet().stream().filter(x -> map.get(x) >= nums.length).collect(Collectors.toList());
    }
}
