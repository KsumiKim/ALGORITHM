package algorithm;

public class MinimumDifferenceBST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(0);
		root2.right = new TreeNode(48);
		root2.right.left = new TreeNode(12);
		root2.right.right = new TreeNode(49);
		
		MinimumDifferenceBST minDiff = new MinimumDifferenceBST();
		int res = minDiff.minDiffInBST2(root);
		System.out.println(res);
	}
	
	boolean init = true;
	int min = Integer.MAX_VALUE;
	int prev = 0;
	
	public int minDiffInBST(TreeNode root) {
		inorder(root);
		return min;
	}
	
	private void inorder(TreeNode node) {
		if (node == null)
			return;
		
		inorder(node.left);
		if (!init) {
			init = true; 
		}
		else {
			min = Math.min(min, node.val - prev);
		}
		inorder(node.right);
	}

    public int minDiffInBST2(TreeNode root) {
    	inorder2(root);
    	return min;
    }
    
    private void inorder2(TreeNode node) {
    	if (node == null) {
    		return;
    	}
    	
    	inorder2(node.left);
    	if (init) {
    		init = false;
    	} else {
    		min = Math.min(min, node.val - prev);
    	}
		prev = node.val;
    	inorder2(node.right);
    }
}
