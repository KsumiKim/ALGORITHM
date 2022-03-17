package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 121;
		int x2 = 10;
		int x3 = 1;
		
		boolean res = isPalindrome(x3);
		System.out.println(res);
	}
	
    public static boolean isPalindrome(int x) {
    	if (x < 0) {
    		return false;
    	}
    	
    	if (x < 10) {
    		return true;
    	}
    	
    	List<Integer> list = new ArrayList<>();
    	int y = x, digitCnt = 0;
    	
    	while (true) {
    		int mod = y % 10;
    		
    		list.add(mod);
    		digitCnt++;
    		y /= 10;
    		if (y < 10) {
    			list.add(y);
        		break;
    		}
    	}
    	
    	for (int i = 0; i < list.size(); i++, digitCnt--) {
    		int num = (int)Math.pow(10, digitCnt);
    		int firstNum = x / num;
    		x -= (num * firstNum);
    		
    		if (firstNum != list.get(i)) {
    			return false;
    		}
    	}
    	return true;
    }
}
