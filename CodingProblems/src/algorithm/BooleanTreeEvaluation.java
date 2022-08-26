package algorithm;

public class BooleanTreeEvaluation {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(1);
		
		boolean res = evaluateTree(root);
		System.out.println(res);
	}
	
	public static boolean evaluateTree(TreeNode root) {
		int res = helper(root);
    	return res == 1;
    }
	
	private static int helper(TreeNode node) {
		if (node == null) {
			return -1;
		}
		
		int leftNode = helper(node.left);
		int rightNode = helper(node.right);
		
		if (leftNode == -1 && rightNode == -1) {
			return node.val;
		}
		
		if ((leftNode == rightNode && node.val == 3) || (leftNode != rightNode && node.val == 2)) {
			return 1;
		}
		
		return 0;
	}
}
