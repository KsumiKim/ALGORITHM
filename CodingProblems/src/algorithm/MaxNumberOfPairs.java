package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberOfPairs {
	
	public static void main(String[] args) {
		int[] nums = {1,3,2,1,3,2,2};
		
		int[] res = numberOfPairs(nums);
		System.out.println(res[0] + ", " + res[1]);
	}

    public static int[] numberOfPairs(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	
    	for (int n : nums) {
    		list.add(n);
    	}
    	
    	int pairCount = 0;
    	boolean hasPair = true;
    	
    	while (hasPair) {
    		boolean hasNoPair = hasPair;
    		
    		for (int i = 0; i < list.size(); i++) {
    			
    			for (int j = i + 1; j < list.size(); j++) {
    				if (list.get(i) == list.get(j)) {
    					list.remove(j);
    					list.remove(i);
    					pairCount++;
    					hasNoPair = false;
    					break;
    				}
    			}
    		}
    		if (hasNoPair) {
    			hasPair = false;
    		}
    	}
    	return new int[] {pairCount, list.size()};
    }

}
