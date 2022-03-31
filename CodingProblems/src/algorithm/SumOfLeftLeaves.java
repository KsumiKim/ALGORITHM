package algorithm;

import java.util.ArrayList;
import java.util.List;

public class SumOfLeftLeaves {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(5);
		
		
		System.out.println(sumOfLeftLeaves(root2));
		
	}
	
    public static int sumOfLeftLeaves(TreeNode root) {
    	
    	return helper(root, false);
    }
    
    private static int helper(TreeNode node, boolean isLeft) {
    	if (node == null)
    		return 0;
    	
    	if (node.left == null && node.right == null && isLeft) 
    		return node.val;

    	int left = helper(node.left, true);
    	int right = helper(node.right, false);
    	
    	return left + right;
    }

    public int sumOfLeftLeaves2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
    	helper2(root, false, list);
    	int sum = 0;
    	
    	for (int n : list) {
    		sum += n;
    	}
    	
    	return sum;
    }
    
    private void helper2(TreeNode node, boolean isLeft, List<Integer> list) {
    	if (node == null)
    		return;
    	
    	if (isLeft && node.left == null) {
    		list.add(node.val);
    	}
    	
    	helper2(node.left, true, list);
    	helper2(node.right, false, list);
    	
    }
}
