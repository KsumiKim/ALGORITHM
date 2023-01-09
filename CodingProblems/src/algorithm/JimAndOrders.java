package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JimAndOrders {

	public static void main(String[] args) {
		List<List<Integer>> orders = Arrays.asList(
				Arrays.asList(1, 3),
				Arrays.asList(2, 3),
				Arrays.asList(3, 3)
				);
		
		List<Integer> res = jimOrders(orders);
		System.out.println(res);
	}
	
    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    	List<List<Integer>> serveTimes = new ArrayList<>();
    	List<Integer> orderList = new ArrayList<>();
    	
    	for (int i = 0; i < orders.size(); i++) {
    		List<Integer> order = orders.get(i);
    		serveTimes.add(Arrays.asList(order.get(0) + order.get(1), i));
    	}
    	    
    	Collections.sort(serveTimes, (a, b) -> a.get(0) == b.get(0) ? a.get(1) - b.get(1) : a.get(0) - b.get(0));
    	
    	for (int i = 0; i < serveTimes.size(); i++) {
    		orderList.add(serveTimes.get(i).get(1) + 1);
    	}
    	return orderList;
    }

}
