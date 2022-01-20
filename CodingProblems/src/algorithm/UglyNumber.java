package algorithm;

import java.util.Arrays;
import java.util.List;

public class UglyNumber {

	public static void main(String[] args) {
		int n = 6;
		int n2 = 1;
		int n3 = 14;
		int n4 = 8;
		
		boolean res = isUgly(n4);
		System.out.println(res);
	}
	
    public static boolean isUgly(int n) {
    	if (n <= 0) {
    		return false;
    	}
    	
    	List<Integer> list = Arrays.asList(2, 3, 5, 6, 10, 15, 30);
    	
    	while (n > 1) {
    		
        	for (int i = 0; i < list.size(); i++) {
        		int num = list.get(i);
        		
        		if (n % num == 0) {
        			n /= num;
        			break;
        		}
        		
        		if (i == list.size() - 1 && n > 1) {
        			return false;
        		}
        	}
    	}
    	return true;
    }
}
