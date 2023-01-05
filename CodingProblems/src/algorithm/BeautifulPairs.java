package algorithm;

import java.util.Arrays;
import java.util.List;

public class BeautifulPairs {
	
	public static void main(String[] args) {
		List<Integer> A = Arrays.asList(1, 2, 3, 4);
		List<Integer> B = Arrays.asList(1, 2, 3, 3);
		
		List<Integer> A2 = Arrays.asList(3, 5, 7, 11, 5, 8);
		List<Integer> B2 = Arrays.asList(5, 7, 11, 10, 5, 8);
		
		int res = beautifulPairs(A2, B2);
		System.out.println(res);
	}

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
    	int pairCount = 1;
    	int[] nums = new int[1000];
    	
    	for (int i = 0; i < A.size(); i++) {
    		for (int j = 0; j < B.size(); j++) {
    			if (A.get(i) == B.get(j) && nums[A.get(i)] == 0) {
    				pairCount++;
    				nums[A.get(i)]++;
    			}
    		}
    	}
    	return pairCount;
    }

}
