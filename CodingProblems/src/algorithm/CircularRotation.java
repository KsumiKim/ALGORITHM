package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularRotation {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, 4, 5);
		int k = 2;
		List<Integer> queries = Arrays.asList(1, 2);

		List<Integer> a2 = Arrays.asList(1, 2, 3, 4);
		int k2 = 4;
		List<Integer> queries2 = Arrays.asList(2, 3);

		List<Integer> a3 = Arrays.asList(5, 6, 7, 8, 9);
		int k3 = 3;
		List<Integer> queries3 = Arrays.asList(3, 4);

		List<Integer> res = circularArrayRotation(a, k, queries);
		System.out.println(res);
	}
	
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    	int[] temp = new int[a.size()];
    	
    	for (int i = 0; i < a.size(); i++) {
    		int idx = i + k;
    		temp[idx % a.size()] = a.get(i);
    	}
    	
    	List<Integer> list = new ArrayList<>();
    	
    	for (int i = 0; i < queries.size(); i++) {
    		list.add(temp[queries.get(i)]);
    	}
    	return list;
    }

}
