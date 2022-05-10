package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumOfTwoNodes {

	// #1. Ssing helper class with a list 
	public boolean findTarget(TreeNode root, int target) {
		
		if (root == null)
			return false;
		
		List<Integer> list = new ArrayList<>();
		
		helper(root, list);
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i + 1; j < list.size(); j++) {
				
				if (list.get(i) + list.get(j) == target)
					return true;
			}
		}
		
		return false;
	}
	
	private void helper(TreeNode node, List<Integer> list) {
		
		if (node == null)
			return;
		
		list.add(node.val);
		helper(node.left, list);
		helper(node.right, list);
	}
	
	public boolean findTarget2(TreeNode root, int target) {
		return helper(root, target, new ArrayList<>());
	}
	
	private boolean helper(TreeNode node, int target, List<Integer> list) {
		if (node == null) {
			return false;
		}
		
		if (list.contains(target - node.val)) {
			return true;
		}
		
		list.add(node.val);
		return helper(node.left, target, list) || helper(node.right, target, list);
	}
}
