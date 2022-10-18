package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

	public static void main(String[] args) {
		List<Integer> p = Arrays.asList(4, 3, 5, 1, 2);
		List<Integer> res = permutationEquation(p);
		System.out.println(res);
	}
	
    public static List<Integer> permutationEquation(List<Integer> p) {
    	List<Integer> list = new ArrayList<>();
    	
    	for (int x = 0; x < p.size(); x++) {

        	for (int i = 0; i < p.size(); i++) {
        		if (p.get(i) == x + 1) {
        		
        			for (int j = 0; j < p.size(); j++) {
        				if (p.get(j) == i + 1) {
                    		list.add(j + 1);
                		}
            		}
        		}
        	}
    	}
    	
    	return list;
    }

}
