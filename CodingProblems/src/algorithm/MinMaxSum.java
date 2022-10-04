package algorithm;

public class MinMaxSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
	
		int[] res = miniMaxSum(arr);
		System.out.println(res[0] + ", " + res[1]);
	}
	
    public static int[] miniMaxSum(int[] arr) {
    	int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    	
    	for (int i = 0; i < arr.length; i++) {
    		int sum = 0;
    		
    		for (int j = 0; j < arr.length; j++) {
    			if (i == j) {
    				continue;
    			}
    			sum += arr[j];
    		}
    		min = Math.min(min, sum);
    		max = Math.max(max, sum);
    	}
    	return new int[] { min, max };
    }

}
