package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidMatrixII {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{3,1,2},
				{2,3,1}	
		};
		
		int[][] matrix2 = {
				{1,1,1},
				{1,2,3},
				{1,2,3}	
		};
		
		int[][] matrix3 = {
				{2,2,2},
				{2,2,2},
				{2,2,2}
		};
		
		boolean res = checkValid(matrix);
		System.out.println(res);
	}
	
    public static boolean checkValid(int[][] matrix) {
    	Set<Integer> numSet = new HashSet<>();
    	
    	for (int i = 1; i < matrix.length + 1; i++) {
    		numSet.add(i);
    	}
    	
    	for (int i = 0; i < matrix.length; i++) {
    		Set<Integer> temp = new HashSet<>(numSet);
    		
    		for (int j = 0; j < matrix[i].length; j++) {
    			int curr = matrix[i][j];
    			
    			if (!temp.contains(curr)) {
    				return false;
    			}
    			temp.remove(curr);
    		}
    		if (!temp.isEmpty()) {
    			return false;
    		}
    	}
    	
    	for (int i = 0; i < matrix.length; i++) {
    		Set<Integer> temp = new HashSet<>(numSet);
    		
    		for (int j = 0; j < matrix[i].length; j++) {
    			int curr = matrix[j][i];
    			
    			if (!temp.contains(curr)) {
    				return false;
    			}
    			temp.remove(curr);
    		}
    		if (!temp.isEmpty()) {
    			return false;
    		}
    	}
    	return true;
    }
    
}
