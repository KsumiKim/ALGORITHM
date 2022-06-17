package algorithm;

import java.util.ArrayList;
import java.util.List;

public class PriorityPrinter {
	
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 1;

		int[] priorities2 = {1, 1, 9, 1, 1, 1};
		int location2 = 0;
		
		int res = getOrder(priorities, location);
		System.out.println(res);
	}

	public static int getOrder(int[] priorities, int location) {
		List<int[]> list = new ArrayList<>();
		int count = 0;
		
		for (int i = 0; i < priorities.length; i++) {
			list.add(new int[] { priorities[i], i });
		}
		
		while (list.size() > 0) {
			int[] pair1 = list.get(0);
			boolean isGreatestOrEqual = true; 
			
			for (int j = 1; j < list.size(); j++) {
				int[] pair2 = list.get(j);
				
				if (pair1[0] < pair2[0]) {
					isGreatestOrEqual = false;
					break;
				}
			}
			
			if (isGreatestOrEqual) {
				count++;
				if (pair1[1] == location) {
					break;
				}
			} else {
				list.add(pair1);
			}
			list.remove(0);
		}
		return count;
	}
}
