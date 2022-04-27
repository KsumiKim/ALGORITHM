package algorithm;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3);
		root.left.right.right = new TreeNode(5);
		
		root.right = new TreeNode(8);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		
		TreeNode p = root.left;
		TreeNode q = root.right;
		
		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(1);
		root2.left.right = new TreeNode(2);
		root2.right = new TreeNode(4);
		
		TreeNode p2 = new TreeNode(3);
		TreeNode q2 = new TreeNode(2);
		
		TreeNode root3 = new TreeNode(2);
		root3.left = new TreeNode(1);
		
		TreeNode p3 = new TreeNode(2);
		TreeNode q3 = new TreeNode(1);

		TreeNode root4 = new TreeNode(2);
		root4.left = new TreeNode(1);
		root4.right = new TreeNode(3);
		
		TreeNode p4 = root4.right;
		TreeNode q4 = root4.left;

		TreeNode result = lowestCommonAncestorOfBST(root4, p4, q4);
		
		System.out.println(result.val);
	}

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	TreeNode node = null;
    	if (root.val > p.val && root.val > q.val) {
    		node = lowestCommonAncestor(root.left, p, q);
    	}
    	
    	if (root.val < p.val && root.val < q.val) {
    		node = lowestCommonAncestor(root.right, p, q);
    	}
    	
    	if ((p.val < root.val && root.val < q.val) || (q.val < root.val && root.val < p.val)) {
    		return root;
    	}
    	
    	if (root.val == q.val || root.val == p.val)
    		return root;
    	
    	return node;
    }
    
    public static TreeNode lowestCommonAncestorTree(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> parentNodeListOfP = new ArrayList<>();
        List<TreeNode> parentNodeListOfQ = new ArrayList<>();
    	
    	helper(root, p, parentNodeListOfP);
    	helper(root, q, parentNodeListOfQ);
    	
    	TreeNode res = null;
    	
    	for (int i = 0; i < Math.min(parentNodeListOfP.size(), parentNodeListOfQ.size()); i++) {
    		
    		if (parentNodeListOfP.get(i) == parentNodeListOfQ.get(i))
    			res = parentNodeListOfP.get(i);
    		else
    			break;
    	}
    	return res;
    }
    
    private static void helper(TreeNode node, TreeNode target, List<TreeNode> list) {
    	if (node == null)
    		return;
    	
    	if (node.left == null && node.right == null)
    		return;
    	
    	if (node.val == target.val)
    		return;

    	list.add(node);
    	helper(node.left, target, list);
    	helper(node.right, target, list);
    }

    
    public static TreeNode lowestCommonAncestorOfBST(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] lca = new TreeNode[1];
        traverse(root, p, q, lca);
    	return lca[0];
    }
    
    private static TreeNode traverse(TreeNode node, TreeNode p, TreeNode q, TreeNode[] lca) {
    	if (node == null) {
    		return node;
    	}
    	
    	TreeNode left = traverse(node.left, p, q, lca);
    	TreeNode right = traverse(node.right, p, q, lca);
    	
    	if ((left == p && right == q) || (left == q && right == p) || (left == p && node == q) || (node == p && left == q) || 
   			(right == p && node == q) || (node == p && right== q)) {
    		lca[0] = node;
    	}
    	
    	return node;
    }
}
