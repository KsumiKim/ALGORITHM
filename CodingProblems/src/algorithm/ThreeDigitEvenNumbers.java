package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeDigitEvenNumbers {
	
	public static void main(String[] args) {
		int[] digits = {2, 1, 3, 0};
		int[] res = findEvenNumbers(digits);
		
		for (int n : res) {
			System.out.println(n);
		}
	}

    public static int[] findEvenNumbers(int[] digits) {
    	Arrays.sort(digits);
    	List<Integer> list = new ArrayList<>();
    	
    	dfs(list, new StringBuilder(), new ArrayList<>(), digits);
    	
    	int[] result = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
    		result[i] = list.get(i);
    	}
    	
    	return result;
    }
    
    private static void dfs(List<Integer> list, StringBuilder sb, List<Integer> indices, int[] digits) {
    	if (sb.length() == 3) {
    		int num = Integer.parseInt(sb.toString());
    		if (num % 2 == 0) {
    			list.add(num);
    		}
    		sb.deleteCharAt(sb.length() - 1);
    		return;
    	}
    	
    	for (int i = 0; i < digits.length; i++) {
    		if ((sb.length() == 0 && digits[i] == 0) || indices.contains(i)) {
    			continue;
    		}
    		
    		indices.add(i);
    		sb.append(digits[i]);
    		dfs(list, sb, indices, digits);
    	}
    }
}
