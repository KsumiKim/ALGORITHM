package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RelativeRank {
	
	public static void main(String[] args) {
		int[] score = {5, 4, 3, 2, 1};
		int[] score2 = {10, 3, 8, 9, 4};
		
		String[] res = findRelativeRanks(score2);
		
		for (String s : res) {
			System.out.println(s);
		}
	}
	
    public static String[] findRelativeRanks(int[] score) {
    	List<int[]> list = new ArrayList<>();
    	
    	for (int i = 0; i < score.length; i++) {
    		list.add(new int[] {score[i], i});
    	}
    	
    	Collections.sort(list, (a, b) -> b[0] - a[0]);
    	String[] result = new String[score.length];
    	
    	for (int i = 0; i < list.size(); i++) {
    		int[] arr = list.get(i);
    		
    		if (i == 0) {
    			result[arr[1]] = "Gold Medal";
    		} else if (i == 1) {
    			result[arr[1]] = "Silver Medal";
    		} else if (i == 2) {
    			result[arr[1]] = "Bronze Medal";
    		} else {
    			result[arr[1]] = i + 1 + "";
    		}
    	}
    	
    	return result;
    }
}
