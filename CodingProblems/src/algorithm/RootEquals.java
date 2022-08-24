package algorithm;

public class RootEquals {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(4);
		root.right = new TreeNode(6);
		
		boolean res = checkTree(root);
		System.out.println(res);
	}
    
	public static boolean checkTree(TreeNode root) {
		return root.left.val + root.right.val == root.val;
    }

}
