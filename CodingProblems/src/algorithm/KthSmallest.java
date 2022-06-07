package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(1);
		root2.left.right = new TreeNode(2);
		root2.right = new TreeNode(4);
		
		int res = kthSmallest2(root2, 1);
		System.out.println(res);
	}
	
    public static int kthSmallest(TreeNode root, int k) {
    	List<Integer> list = new ArrayList<>();
    	helper(root, list);
    	Collections.sort(list);
    	return list.get(k - 1);
    }
    
    private static void helper(TreeNode node, List<Integer> list) {
    	if (node == null)
    		return;
    	
    	list.add(node.val);
    	helper(node.left, list);
    	helper(node.right, list);
    }

    public static int kthSmallest2(TreeNode root, int k) {
    	List<Integer> list = new ArrayList<>();
    	helper2(root, k, list);
    	return list.get(k - 1);
    }
    
    private static void helper2(TreeNode node, int k, List<Integer> list) {
    	if (node == null) {
    		return;
    	}
    	if (list.size() == k) {
    		return;
    	}
    	helper2(node.left, k, list);
    	list.add(node.val);
    	helper2(node.right, k, list);
    }
   
    static int count = 0;
    static int res = -1;
    
    public static int kthSmallest3(TreeNode root, int k) {
    	if (root == null) {
    		return 0;
    	}
    	if (res >= 0) {
    		return res;
    	}
    	kthSmallest3(root.left, k);
    	count++;
    	if (count == k) {
    		res = root.val;
    	}
    	kthSmallest3(root.right, k);
    	return res;
    }
}
