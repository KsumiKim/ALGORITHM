package algorithm;

import java.util.Arrays;
import java.util.List;

public class Workbook {
	
	public static void main(String[] args) {
		int n = 5, k = 3;
		List<Integer> arr = Arrays.asList(4, 2, 6, 1, 10);
		
		int res = workbook(n, k, arr);
		System.out.println(res);
	}

    public static int workbook(int n, int k, List<Integer> arr) {
    	int currPage = 1, specialProblem = 0;
    	
    	for (int problem : arr) {
			boolean completed = false;

			for (int i = 1; i < problem + 1; i++) {
    			if (i == currPage) {
    				specialProblem++;
    			} else if (i % k == 0) {
    				currPage++;
    				completed = true;
    			}
    		}
    		if (!completed) {
				currPage++;
    		}
    	}
    	return specialProblem;
    }
}
