package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumStack {
	
	List<Integer> list;
	int min = Integer.MAX_VALUE;
	
    public MinimumStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if (val < min) {
        	min = val;
        }
    }
    
    public void pop() {
        list.remove(list.size() - 1);
    }
    
    public int top() {
    	return list.get(list.size() - 1);
    }
    
    public int getMin() {
    	return min;
    }
}
