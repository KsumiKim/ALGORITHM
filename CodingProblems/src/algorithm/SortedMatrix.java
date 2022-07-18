package algorithm;

import java.util.PriorityQueue;

public class SortedMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = {
			{1, 5, 9},
			{10, 11, 13},
			{12, 13, 15}
		};
		int k = 8;
		
		int[][] matrix2 = {
				{-5},
			};
			int k2 = 1;
		
		int res = kthSmallest(matrix2, k2);
		System.out.println(res);
	}

    public static int kthSmallest(int[][] matrix, int k) {
    	PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> a - b);
    	
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix[i].length; j++) {
    			queue.add(matrix[i][j]);
    		}
    	}
    	
    	int idx = 1, result = 0;
    	while (true) {
    		if (idx == k) {
        		result = queue.poll();
    			break;
    		} 
    		queue.poll();
    		idx++;
    	}
    	return result;
    }
}
