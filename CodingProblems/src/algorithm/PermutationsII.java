package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		int[] nums2 = {1, 2, 3};
		
		List<List<Integer>> result = permuteUnique(nums2);
		
		for (List<Integer> list : result) {
			for (int n : list) {
				System.out.print(n + ", ");
			}
			System.out.println();
		}
	}
	
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> idxGroupList = new ArrayList<>();
        dfs(idxGroupList, new ArrayList<>(), nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (List<Integer> idxList : idxGroupList) {
        	List<Integer> list = new ArrayList<>();
        	
        	for (int idx : idxList) {
        		list.add(nums[idx]);
        	}
        	if (!result.contains(list)) {
        		result.add(list);
        	}
        }
        
    	return result;
    }
    
    private static void dfs(List<List<Integer>> idxGroupList, List<Integer> list, int[] nums) {
    	if (list.size() == nums.length) {
			idxGroupList.add(new ArrayList<>(list));
    		return;
    	}
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (!list.contains(i)) {
        		list.add(i);
        		dfs(idxGroupList, list, nums);
        		list.remove(list.size() - 1);
    		}
    	}
    }

}
