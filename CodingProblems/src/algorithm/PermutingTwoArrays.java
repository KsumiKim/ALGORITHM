package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

	public static void main(String[] args) {
		int k = 1;
		List<Integer> A = Arrays.asList(2, 1, 3);
		List<Integer> B = Arrays.asList(7, 8, 9);
		
		boolean res = isValidTwoArrays(k, A, B);
		System.out.println(res);
	}
	
    public static boolean isValidTwoArrays(int k, List<Integer> A, List<Integer> B) {
    	boolean isValid = true;
    	Collections.sort(A);
    	Collections.sort(B, (a, b) -> b - a);
    	
    	for (int i = 0; i < A.size(); i++) {
    		if (A.get(i) + B.get(i) < k) {
    			isValid = false;
    			break;
    		}
    	}
    	return isValid;
    }

}
