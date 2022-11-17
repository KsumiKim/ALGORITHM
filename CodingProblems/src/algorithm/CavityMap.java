package algorithm;

import java.util.Arrays;
import java.util.List;

public class CavityMap {
	
	public static void main(String[] args) {
		List<String> grid = Arrays.asList("1112", "1912", "1892", "1234");
		List<String> grid2 = Arrays.asList("989", "191", "111");
		cavityMap(grid2);
		System.out.println(grid2);
	}

    public static List<String> cavityMap(List<String> grid) {
    	
    	for (int i = 1; i < grid.size() - 1; i++) {
    		String prevNumStr = grid.get(i - 1);
    		String numStr = grid.get(i);
    		String nextNumStr = grid.get(i + 1);
			StringBuilder sb = new StringBuilder(numStr);
    		
    		for (int j = 1; j < numStr.length() - 1; j++) {
    			char curr = numStr.charAt(j);
    			
    			if (numStr.charAt(j - 1) > curr) {
    				continue;
    			}
    			if (numStr.charAt(j + 1) > curr) {
    				continue;
    			}
    			if (prevNumStr.charAt(j) > curr) {
    				continue;
    			}
    			if (nextNumStr.charAt(j) > curr) {
    				continue;
    			}
    			sb.setCharAt(j, 'X');
    		}
    		grid.set(i, sb.toString());
    	}
    	return grid;
    }

}
