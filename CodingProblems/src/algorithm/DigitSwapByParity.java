package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitSwapByParity {
	
	public static void main(String[] args) {
		int num = 1234;
		int num2 = 65875;
		int num3 = 247;
		
		int res = largestInteger(num3);
		System.out.println(res);
	}

    public static int largestInteger(int num) {
    	StringBuilder sb = new StringBuilder(Integer.toString(num));
    	List<Character> odds = new ArrayList<>();
    	List<Character> evens = new ArrayList<>();
    	
    	for (int i = 0; i < sb.length(); i++) {
    		if (sb.charAt(i) % 2 == 0) {
    			evens.add(sb.charAt(i));
    		} else {
    			odds.add(sb.charAt(i));
    		}
    	}
    	Collections.sort(odds, (a, b) -> b - a);
    	Collections.sort(evens, (a, b) -> b - a);
    	
    	for (int i = 0, j = 0, k = 0; i < sb.length(); i++) {
    		if (sb.charAt(i) % 2 == 0) {
    			sb.setCharAt(i, evens.get(k++));
    		} else {
    			sb.setCharAt(i, odds.get(j++));
    		}
    	}
    	return Integer.parseInt(sb.toString());
    }
}
