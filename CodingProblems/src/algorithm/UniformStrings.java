package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniformStrings {
	
	public static void main(String[] args) {
		String s = "abbcccdddd";
		List<Integer> queries = Arrays.asList(1, 7, 5, 4, 15);
		List<String> res = weightedUniformStrings(s, queries);
		System.out.println(res);
	}

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
    	List<Integer> weights = new ArrayList<>();
    	List<String> uniformStrings = new ArrayList<>();
    	
    	char prev = '-';
    	
    	for (int i = 0; i < s.length(); i++) {
			int weight = (int)s.charAt(i) - 97 + 1;

    		if (prev != s.charAt(i)) {
    			if (weights.size() > 0) {
        			weights.add(weight + weights.get(weights.size() - 1));
    			} else {
    				weights.add(weight);
    			}
    		} else {
    			weights.add(weight);
    		}
    	}
    	
    	for (int query : queries) {
    		if (weights.contains(query)) {
    			uniformStrings.add("Yes");
    		} else {
    			uniformStrings.add("No");
    		}
    	}
    	return uniformStrings;
    }

}
