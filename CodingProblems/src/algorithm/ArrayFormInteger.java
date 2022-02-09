package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormInteger {
	
	public static void main(String[] args) {
		int[] num = {1, 2, 0, 0};
		int k = 34;
		
		int[] num2 = {2, 7, 4};
		int k2 = 181;
		
		int[] num3 = {2, 1, 5};
		int k3 = 806;
		
		List<Integer> res = addToArrayForm(num3, k3);
		System.out.println(res);
	}

    public static List<Integer> addToArrayForm(int[] num, int k) {
    	List<Integer> res = new ArrayList<>();
    	int idx = num.length - 1;
    	
    	while (true) {
    		int mod = k % 10;
    		num[idx] += mod;
    		k /= 10;
    		
    		if (k < 10) {
    			num[--idx] += k;
        		break;
    		}
    		idx--;
    	}
    	
    	boolean isGreaterThan10 = false;
    	int i = num.length - 1;
    	
    	while (i >= 0 || isGreaterThan10) {

    		if (i < 0) {
    			res.add(0, 1);
    			break;
    		}
    		
    		int value = num[i--];
    		
    		if (isGreaterThan10) {
    			value++;
    		}
    		
    		if (value >= 10) {
    			isGreaterThan10 = true;
    			value = value % 10;
    		} else {
    			isGreaterThan10 = false;
    		}

    		res.add(0, value);
    	}
    	return res;
    }
}
