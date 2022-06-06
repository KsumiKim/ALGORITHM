package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Inorder {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		
		
		System.out.println(inorderTraversal(root));
	}
	
    public static List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> result = new ArrayList<>();
    	helper(root, result);
    	return result;
    }
    
    private static void helper(TreeNode node, List<Integer> list) {
    	if (node == null) {
    		return;
    	}
    	
    	helper(node.left, list);
    	list.add(node.val);
    	helper(node.right, list);
    }
}
