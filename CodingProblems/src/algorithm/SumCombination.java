package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SumCombination {
	
	public static void main(String[] args) {
		int[] candidates = {2, 3, 6, 7};
		int target = 7;

		int[] candidates2 = {2, 3, 5};
		int target2 = 8;
		
		int[] candidates3 = {2};
		int target3 = 1;
		
		List<List<Integer>> result = combinationSum(candidates3, target3);
		System.out.println(result);
	}

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<>();
    	helper(result, new ArrayList<>(), candidates, 0, target);
    	return result;
    }
    
    private static void helper(List<List<Integer>> result, List<Integer> list, int[] candidates, int idx, int target) {
    	int sum = 0;
    	for (int n : list) {
    		sum += n;
    	}
    	
    	if (sum > target) {
    		return;
    	}
    	
    	if (sum == target) {
    		result.add(new ArrayList<>(list));
    		return;
    	}
    	
    	for (int i = 0; i < candidates.length; i++) {
    		if (i >= idx) {
        		list.add(candidates[i]);
        		helper(result, list, candidates, i, target);
        		list.remove(list.size() - 1);
    		}
    	}
    }
}
