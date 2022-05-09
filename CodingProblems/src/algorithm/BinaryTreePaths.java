package algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(5);
		
		List<String> list = bstPath(root);
		System.out.println(list);
	}
	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<>();
        
        helper(root, "", pathList);
        
    	return pathList;
    }
    
    private void helper(TreeNode node, String path, List<String> list) {
    	StringBuilder sb = new StringBuilder(path);
    	
    	if (node.left == null && node.right == null) {
    		sb.append(node.val);
    		list.add(sb.toString());
    		return;
    	}
    	
    	sb.append(node.val);
    	
    	if (node.left != null) {
    		sb.append("->");
    		helper(node.left, sb.toString(), list);
    	}
    	
    	if (node.right != null) {
    		if (node.left == null)
    			sb.append("->");
    		helper(node.right, sb.toString(), list);
    	}
    }
    
    public static List<String> bstPath(TreeNode root) {
    	List<String> list = new ArrayList<>();
    	traverse(root, new StringBuilder(), list);
    	return list;
    }
    
    private static void traverse(TreeNode node, StringBuilder path, List<String> list) {
    	if (node == null) {
    		return;
    	}
    	
    	int initLength = path.length();
    	path.append(node.val);
    	
    	if (node.left == null && node.right == null) {
    		list.add(path.toString());
    	} else {
    		path.append("->");
    		traverse(node.left, path, list);
    		traverse(node.right, path, list);
    	}
    	path.setLength(initLength);
    }
}













