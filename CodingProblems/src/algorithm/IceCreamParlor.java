package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {

	public static void main(String[] args) {
		int m = 6;
		List<Integer> arr = Arrays.asList(1, 3, 4, 5, 6);
		
		List<Integer> res = icecreamParlor(m, arr);
		System.out.println(res);
	}
	
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    	List<Integer> res = new ArrayList<>();
    	
    	for (int i = 0; i < arr.size(); i++) {
    		
    		for (int j = i + 1; j < arr.size(); j++) {
    			if (arr.get(i) + arr.get(j) == m) {
    				res.add(arr.get(i));
    				res.add(arr.get(j));
    				break;
    			}
    		}
    	}
    	return res;
    }

}
