package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MatrixZeroes {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};

		int[][] matrix2 = {
				{0,1,2,0},
				{3,4,5,2},
				{1,3,1,5}
		};
		setZeroes(matrix2);
		
		for (int i = 0; i < matrix2.length; i++) {
    		for (int j = 0; j < matrix2[i].length; j++) {
    			System.out.print(matrix2[i][j] + ", ");
    		}
    		System.out.println();
    	}
	}

    public static void setZeroes(int[][] matrix) {
    	List<int[]> zeroes = new ArrayList<>();
    	
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
    			if (matrix[i][j] == 0) {
    				zeroes.add(new int[] { i, j });
    			}
    		}
    	}
    	
    	for (int i = 0; i < zeroes.size(); i++) {
    		int[] point = zeroes.get(i);
    		
    		for (int row = 0; row < matrix[0].length; row++) {
    			matrix[point[0]][row] = 0;
    		}
    		
    		for (int col = 0; col < matrix.length; col++) {
    			matrix[col][point[1]] = 0;
    		}
    	}
    }
}
