package algorithm;

public class OneDimensionalToTwo {
	
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4};
		int m = 2, n = 2;
		
		int[][] result = construct2DArray(original, m, n);
		
		for (int[] nums : result) {
			for (int num : nums) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
	
    public static int[][] construct2DArray(int[] original, int m, int n) {
    	if (m * n != original.length) {
    		return new int[][] {};
    	}
    	
    	int[][] result = new int[m][n];
    	int idx = 0;
    	
    	for (int i = 0; i < result.length; i++) {
    		for (int j = 0; j < result[i].length; j++) {
    			result[i][j] = original[idx++];
    		}
    	}
    	return result;
    }
}
