package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		int[] nums2 = {0, 1};
		int[] nums3 = {1};
		
		System.out.println(permute(nums2));
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		dfs(nums, new ArrayList<>(), result);
		return result;
    }
	
	private static void dfs(int[] nums, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<>(list));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
				dfs(nums, list, result);
				list.remove(list.size() - 1);
			}
		}
	}
}
