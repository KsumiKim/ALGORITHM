package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxDepthOfBST {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		TreeNode root2 = new TreeNode(1);
		root2.right = new TreeNode(2);
		
//		int res = maxDepth(root2);
//		System.out.println(res);
		
		int[] nums = {1, 2, 3};
		System.out.println(subsets(nums));
		
	}

	public static int maxDepth(TreeNode root) {
		return helper(root, 0);
	}
	
	private static int helper(TreeNode node, int level) {
		if (node == null) {
			return level;
		}
		
		int leftDepth = helper(node.left, level + 1);
		int rightDepth = helper(node.right, level + 1);
		
		return Math.max(leftDepth, rightDepth);
	}
	
	
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<>());
		
		helper(nums, result, new ArrayList<>());
		return result;
	}
	
	private static void helper(int[] nums, List<List<Integer>> result, List<Integer> list) {
		
		for (int i = 0; i < nums.length; i++) {
			if (list.contains(nums[i])) {
				continue;
			}
			list.add(nums[i]);
			result.add(new ArrayList<>(list));
			helper(nums, result, list);
			list.remove(list.size() - 1);
		}
	}
}
