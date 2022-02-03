package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 4, 5, 7};
		int[] nums2 = {0, 2, 3, 4, 6, 8, 9};
		
		List<String> res = summaryRanges(nums2);
		System.out.println(res);
	}

    public static List<String> summaryRanges(int[] nums) {
    	List<String> result = new ArrayList<>();
    	boolean continuous = false;
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
    			
    			if (!continuous) {
    				sb.append(nums[i]);
    			} 
    			continuous = true;
    			continue;
    		} 
    		
    		if (continuous) {
    			
    			if (sb.length() > 0) {
        			sb.append("->");
    			}
    			sb.append(nums[i]);
    			result.add(sb.toString());
    			sb.delete(0, sb.length());
    			continuous = false;
    			continue;
    		}
			sb.append(nums[i]);
			result.add(sb.toString());
			sb.delete(0, sb.length());
    	}
    	
    	return result;
    }
}
