package algorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class XKind {
	
	public static void main(String[] args) {
		int[] deck = {1,2,3,4,4,3,2,1};
		int[] deck2 = {1,1,1,2,2,2,3,3};
		int[] deck3 = {1};
		int[] deck4 = {1, 1};
		int[] deck5 = {1,1,2,2,2,2};
		int[] deck6 = {1,1,1,1,2,2,2,2,2,2};
		
		
		boolean res = hasGroupsSizeX(deck2);
		System.out.println(res);
	}
    public static boolean hasGroupsSizeX(int[] deck) {
    	Map<Object, List<Integer>> map = Arrays.stream(deck).boxed()
    									.collect(Collectors.groupingBy(a -> a));
    	
    	int minSize = map.values().stream().mapToInt(a -> a.size()).min().getAsInt();
    	
    	if (minSize < 2) {
    		return false;
    	}
    	
    	while (minSize >= 2) {
    		boolean result = true;
        	for (List<Integer> values : map.values()) {
        		if (values.size() % minSize != 0) {
        			result = false;
        		}
        	}
        	if (result) {
        		return result;
        	}
        	minSize--;
    	}
    	return false;
    }
    
}
