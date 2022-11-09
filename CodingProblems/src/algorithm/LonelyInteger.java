package algorithm;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 0, 1, 2, 1);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 3, 2, 1);

		int res = lonelyInteger(list2);
		System.out.println(res);
	}

    public static int lonelyInteger(List<Integer> list) {
    	int[] arr = new int[101];
    	int lonely = -1;
    	
    	for (int n : list) {
    		arr[n]++;
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == 1) {
    			lonely = i;
    			break;
    		}
    	}
    	return lonely;
    }
}
