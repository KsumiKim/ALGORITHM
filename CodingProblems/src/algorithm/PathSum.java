package algorithm;

public class PathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(4);
		
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right = new TreeNode(1);
		
		System.out.println(addsToTargetSum(root, 22));
	}
	 
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        
    	return helper(root, targetSum, 0);
    }
    
    private static boolean helper(TreeNode node, int targetSum, int currentSum) {
    	if (node.left == null && node.right == null)
    		return targetSum == currentSum;
    	
    	boolean leftContains = false, rightContains = false;
    	
    	if (node.left != null)
    		leftContains = helper(node.left, targetSum, currentSum + node.val);
    	if (node.right != null)
    		rightContains = helper(node.right, targetSum, currentSum + node.val);
    	
    	return leftContains || rightContains;
    }


    public static boolean addsToTargetSum(TreeNode root, int targetSum) {
    	if (root == null)
    		return false;
    	
    	return hasTargetSum(root, 0, targetSum);
    }
    
    private static boolean hasTargetSum(TreeNode node, int curr, int target) {
    	if (node == null) {
    		return false;
    	}
    	
    	if (node.left == null && node.right == null) {
    		return node.val + curr == target;
    	}
    	
    	return hasTargetSum(node.left, curr + node.val, target) || hasTargetSum(node.right, curr + node.val, target);
    }
}
