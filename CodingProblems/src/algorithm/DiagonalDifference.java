package algorithm;

public class DiagonalDifference {
	
	public static void main(String[] args) {
		int[][] arr = {
			{11, 2, 4},
			{4, 5, 6},
			{10, 8, -12}
		};
		
		int res = diagonalDifference(arr);
		System.out.println(res);
	}

    public static int diagonalDifference(int[][] arr) {
    	int sum1 = 0, sum2 = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		sum1 += arr[i][i];
    		sum2 += arr[i][arr.length - 1 - i];
    	}
    	return Math.abs(sum1 - sum2);
    }

}
