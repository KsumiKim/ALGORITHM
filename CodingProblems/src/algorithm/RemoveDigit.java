package algorithm;

import java.util.ArrayList;
import java.util.List;

public class RemoveDigit {
	
	public static void main(String[] args) {
		String number = "123"; 
		char digit = '3';
		
		String res = removeDigit(number, digit);
		System.out.println(res);
	}

    public static String removeDigit(String number, char digit) {
    	List<Integer> list = new ArrayList<>();
    	int start = 0;
    	
    	while (number.indexOf(digit, start) >= 0) {
    		int idx = number.indexOf(digit, start);
    		StringBuilder sb = new StringBuilder(number);
    		String removed = sb.deleteCharAt(idx).toString();
    		list.add(Integer.parseInt(removed));
    		start = idx + 1;
    	}
    	list.sort((a, b) -> b - a);
    	return list.get(0).toString();
    }

}
