package algorithm;

public class BSTCousins {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.right = new TreeNode(4);
//		root.right.right = new TreeNode(4);
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		root.right.left.right = new TreeNode(4);
		root.right.left.right.right = new TreeNode(5);
		
		boolean res = isCousins(root, 1, 3);
		System.out.println(res);
	}
	
    public static boolean isCousins(TreeNode root, int x, int y) {
    	int[] nodeArr = new int[100];
    	return helper(root, null, nodeArr, 0, x, y);
    }
    
    private static boolean helper(TreeNode root, TreeNode parentNode, int[] nodeArr, int level, int x, int y) {
    	if (root == null)
    		return false;
    	
    	if (root.val == x || root.val == y) {
    		if (parentNode == null) {
    			return false;
    		}
    		
    		if (nodeArr[level] > 0 && parentNode.val != nodeArr[level]) {
    			return true;
    		} 
			nodeArr[level] = parentNode.val;	
    	}
    	
    	boolean isLeft = helper(root.left, root, nodeArr, level + 1, x, y);
    	boolean isRight = helper(root.right, root, nodeArr, level + 1, x, y);
    	
    	return isLeft || isRight;
    }
}
