package algorithm;

import java.util.ArrayList;
import java.util.List;

public class LargeGroups {
	
	public static void main(String[] args) {
		String s = "abcdddeeeeaabbbcd";
		String s2 = "abc";
		String s3 = "abbxxxxzzy";
		String s4 = "aaa";
		
		List<List<Integer>> res = largeGroupPositions(s);
		System.out.println(res);
	}

    public static List<List<Integer>> largeGroupPositions(String s) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<Integer> subList = new ArrayList<>();
    	
    	int count = 1;
    	for (int i = 0; i < s.length(); i++) {
    		
    		if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) { 
        		if (count >= 3) {
        			subList.add(i - count + 1);
        			subList.add(i);
        			result.add(new ArrayList<>(subList));
        			subList.clear();
        		} 
        		count = 1;
        		continue;
    		}
    		count++;	
    	}
    	return result;
    }
}
