package algorithm;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] A = {0, 3, 2, 1};
		int[] A2 = {2, 1};
		int[] A3 = {3, 5, 5};
		int[] A4 = {9,8,7,6,5,4,3,2,1,0};
		int[] A5 = {0,1,2,3,4,5,6,7,8,9};
		ValidMountainArray mountArray = new ValidMountainArray();
		boolean res = mountArray.validMountainArray2(A);
		System.out.println(res);
	}
	
    public boolean validMountainArray(int[] A) {
    	
    	if (A.length < 4)
    		return false;
    	
    	int peak = Integer.MIN_VALUE;
    	int prev = A[0];
    	boolean isIncreasing = true;
    	
    	for (int n : A)
    		peak = Math.max(peak, n);
    	
    	for (int i = 1; i < A.length; i++) {
    		
    		if (isIncreasing) {
    			if (A[i] <= prev)
    				return false;
    		} else {
    			if (A[i] >= prev)
    				return false;
    		}
    		prev = A[i];
    		
    		if (A[i] == peak)
    			isIncreasing = false;
    	}
    	
    	return true;
    }
    
    public boolean validMountainArray2(int[] arr) {
    	
    	if (arr.length < 3) {
    		return false;
    	}
    	
    	int prev = arr[0];
    	boolean increasing = true;
    	
    	for (int i = 1; i < arr.length; i++) {
    		
    		if (arr[i] == prev) {
    			return false;
    		}
    		
    		if (i == 1 && arr[i] < prev) {
    			return false;
    		}
    		
    		if (increasing && arr[i] < prev) {
    			increasing = false;
    		}
    		
    		if (!increasing && arr[i] > prev) {
    			return false;
    		}
    		
    		prev = arr[i];
    	}
    	
    	return !increasing;
    }
}
