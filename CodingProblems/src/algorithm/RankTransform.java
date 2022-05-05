package algorithm;

import java.util.PriorityQueue;

public class RankTransform {
	
	public static void main(String[] args) {
		int[] arr = {40, 10, 20, 30};
		int[] arr2 = {100, 100, 100};
		int[] arr3 = {37,12,28,9,100,56,80,5,12};
		
		int[] res = arrayRankTransform(arr3);
		
		for (int n : res) {
			System.out.print(n + ", ");
		}
	}
	
    public static int[] arrayRankTransform(int[] arr) {
    	PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    	
    	for (int i = 0; i < arr.length; i++) {
    		queue.add(new int[] {arr[i], i});
    	}
    	
    	int rank = 1;
    	while(!queue.isEmpty()) {
    		int[] pair = queue.poll();
    		arr[pair[1]] = rank;
    		
    		rank = (!queue.isEmpty() && queue.peek()[0] > pair[0]) ? rank + 1 : rank;
    	}
    	return arr;
    }
}
