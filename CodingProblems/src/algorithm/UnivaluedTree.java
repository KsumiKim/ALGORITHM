package algorithm;

public class UnivaluedTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(1);
		
		root.right.right = new TreeNode(1);
		
		UnivaluedTree uniTree = new UnivaluedTree();
		boolean res = uniTree.isUnivalued(root);
		System.out.println(res);
	}
	
    public boolean isUnivalTree(TreeNode root) {
    	return helper(root, root.val);
    }
    
    private boolean helper(TreeNode node, int prevVal) {
    	if (node == null)
    		return true;
    	
    	if (node.val != prevVal)
    		return false;
    	
    	return helper(node.left, node.val) && helper(node.right, node.val);
    }
    
    public boolean isUnivalued(TreeNode root) {
    	return traverse(root, root.val);
    }
    
    private boolean traverse(TreeNode node, int val) {
    	if (node == null) {
    		return true;
    	}
    	if (node.val != val) {
    		return false;
    	}
    	return traverse(node.left, node.val) && traverse(node.right, node.val);
    }
}
