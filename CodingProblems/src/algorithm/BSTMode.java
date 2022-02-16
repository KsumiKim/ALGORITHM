package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BSTMode {

    public int[] findMode(TreeNode root) {
    	Map<Integer, Integer> map = new HashMap<>();
    	helper(root, map);
    	
    	int max = 0;
    	List<Integer> list = new ArrayList<>();
    	
    	for (int key : map.keySet()) {
    		int cnt = map.get(key);
    		
    		if (cnt > max) {
    			max = cnt;
    			list.removeAll(list);
    			list.add(key);
    		}
    		
    		if (cnt == max) {
    			list.add(key);
    		}
    	}
    	
    	int[] res = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
    		res[i] = list.get(i);
    	}
    	return res;
    }
    
    private void helper(TreeNode node, Map<Integer, Integer> map) {
    	if (node == null)
    		return;
    	
    	map.put(node.val, map.getOrDefault(node.val, 0) + 1);
    }
}
