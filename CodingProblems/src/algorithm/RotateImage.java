package algorithm;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] matrix2 = {
				{5, 1, 9, 11},
				{2, 4, 8, 10},
				{13, 3, 6, 7},
				{15, 14, 12, 16}
		};
		
		int[][] res = rotate(matrix2);
		
		for (int[] nums : res) {
			for (int n : nums) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}
	
    public static int[][] rotate(int[][] matrix) {
    	int[][] rotated = new int[matrix.length][matrix[0].length];
    	
    	for (int i = 0; i < matrix.length; i++) {
    		
    		for (int j = 0; j < matrix[i].length; j++) {
    			int row = j;
    			int col = matrix[i].length - i - 1;
    			
    			rotated[row][col] = matrix[i][j];
    		}
    	}
    	return rotated;
    }
}
