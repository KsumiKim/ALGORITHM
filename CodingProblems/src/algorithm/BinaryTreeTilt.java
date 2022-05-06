package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTilt {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		TreeNode root2 = new TreeNode(4);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(9);
		root2.left.left = new TreeNode(3);
		root2.left.right = new TreeNode(5);
		root2.right.right = new TreeNode(7);
		
		BinaryTreeTilt bTreeTilt = new BinaryTreeTilt();
		int result = bTreeTilt.findTilt(root2);
		System.out.println(result);
		
	}
	// find sum of the difference between left and right nodes for each tree node
	public int findTile(TreeNode root) {
		
		if (root == null)
			return 0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		helper(root, queue);
		
		int sum = 0;
		
		while (!queue.isEmpty()) {
			sum += queue.poll();
		}
		
		return sum;
	}
	
	private int helper(TreeNode node, Queue<Integer> queue) {
		
		if (node == null)
			return 0;
		
		int left = helper(node.left, queue);
		int right = helper(node.right, queue);
		
		queue.add(Math.abs(left - right));
		
		return node.val;
	}

    public int findTilt(TreeNode root) {
    	int[] sum = new int[1];
    	traverse(root, sum);
        return sum[0];
    }
    
    private int traverse(TreeNode node, int[] sum) {
    	if (node == null) {
    		return 0;
    	}
    	
    	int left = traverse(node.left, sum);
    	int right = traverse(node.right, sum);
    	int original = node.val;
    	
    	node.val = Math.abs(left - right);
    	sum[0] += node.val;
    	
        return left + right + original;
    }
}
