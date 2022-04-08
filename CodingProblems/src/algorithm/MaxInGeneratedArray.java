package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MaxInGeneratedArray {
	
	public static void main(String[] args) {
		int n = 3;
		int res = getMaximumGenerated(n);
		System.out.println(res);
	}

    public static int getMaximumGenerated(int n) {
    	if (n == 0) {
    		return 0;
    	}
    	List<Integer> list = new ArrayList<>();
    	list.add(0);
    	list.add(1);
    	int i = 1, max = 1;
    	
    	while (i * 2 + 2 <= n + 1) {

    		if (list.size() < n + 1) {
        		list.add(list.get(i));
    			max = Math.max(max, list.get(i));
    		}

    		if (list.size() < n + 1) {
        		list.add(list.get(i) + list.get(i + 1));
    			max = Math.max(max, list.get(i) + list.get(i + 1));
    		}
    		i++;
    	}
    	return max;
    }
}
