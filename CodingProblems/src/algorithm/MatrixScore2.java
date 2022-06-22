package algorithm;

public class MatrixScore2 {
	
	public static void main(String[] args) {
		int[][] grid = {
				{0,0,1,1},
				{1,0,1,0},
				{1,1,0,0}
		};
		
		MatrixScore2 score = new MatrixScore2();
		int res = score.matrixScore(grid);
		System.out.println(res);
	}

    public int matrixScore(int[][] A) {
    	int[] countArr = new int[A[0].length];
    	int score = 0;
    	
    	for (int i = 0; i < A.length; i++) {
    		if (A[i][0] == 0) {
    			flipRow(A[i]);
    		}
    	}
    	
    	for (int i = 0; i < A[0].length; i++) {
    		countArr[i] = countOnes(A, i);
    	}
    	
    	for (int i = 0; i < countArr.length; i++) {
    		if (countArr[i] <= A.length / 2) {
    			flipColumn(A, i);
    		}
    	}
    	
    	for (int i = 0; i < A.length; i++) {
    		int sum = 0;
    		
    		for (int j = A[i].length - 1; j >= 0; j--) {
    			if (A[i][j] == 0) 
    				continue;
    			sum += Math.pow(2, A[i].length - 1 - j);
    		}
    		score += sum;
    	}
    	
    	return score;
    }
    
    private void flipColumn(int[][] matrix, int row) {
    	for (int i = 0; i < matrix.length; i++) {
    		if (matrix[i][row] == 1) {
    			matrix[i][row] = 0;
    		} else {
    			matrix[i][row] = 1;
    		}
    	}
    }
    
    private int countOnes(int[][] matrix, int row) {
    	int count = 0;
    	
    	for (int i = 0; i < matrix.length; i++) {
    		if (matrix[i][row] == 1) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    private void flipRow(int[] row) {
    	
    	for (int i = 0; i < row.length; i++) {
    		if (row[i] == 0) {
    			row[i] = 1;
    		} else {
    			row[i] = 0;
    		}
    	}
    }
    
}
