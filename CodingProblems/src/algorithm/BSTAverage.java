package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BSTAverage {

    public List<Double> averageOfLevels(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	helper(root, list, 1);
    	List<Double> result = new ArrayList<>();

    	for (List<Integer> subList : list) {
    		long sum = 0;
    		for (int n : subList) {
    			sum += n;
    		}
			result.add((double)sum / (double)subList.size());
    	}
    	return result;
    }
    
    private void helper(TreeNode node, List<List<Integer>> list, int level) {
    	if (node == null) {
    		return;
    	}
    	
    	if (list.size() < level) {
    		List<Integer> subList = new ArrayList<>();
    		subList.add(node.val);
    		list.add(subList);
    	} else {
    		List<Integer> subList = list.get(level);
    		subList.add(node.val);
    	}
    	
    	helper(node.left, list, level + 1);
    	helper(node.right, list, level + 1);
    }
}
