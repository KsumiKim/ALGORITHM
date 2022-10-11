package algorithm;

public class DivisibleSumPairs {
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 6, 1, 2};
		int n = 6, k = 3;
		
		int res = divisibleSumPairs(n, k, arr);
		System.out.println(res);
	}

    public static int divisibleSumPairs(int n, int k, int[] arr) {
    	int count = 0;
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		for (int j = i + 1; j < arr.length; j++) {
    			int sum = arr[i] + arr[j];

    			if (sum % k == 0) {
    				count++;
    			}
    		}
    	}
    	return count;
    }
}
