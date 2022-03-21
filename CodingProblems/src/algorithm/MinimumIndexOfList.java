package algorithm;

import java.util.ArrayList;
import java.util.List;

public class MinimumIndexOfList {
	
	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		
		String[] list3 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list4 = {"KFC","Shogun","Burger King"};
		
		String[] res = findRestaurant(list3, list4);

		for (String s : res) {
			System.out.print(s + ", ");
		}
	}
	
    public static String[] findRestaurant(String[] list1, String[] list2) {
    	int minIdxSum = Integer.MAX_VALUE;
    	List<String> restaurantList = new ArrayList<>();
    	
    	for (int i = 0; i < list1.length; i++) {
    		
    		for (int j = 0; j < list2.length; j++) {
    			
    			if (list1[i].equals(list2[j])) {
    				
    				if (minIdxSum > i + j) {
    					minIdxSum = i + j;
    					restaurantList.clear();
    					restaurantList.add(list1[i]);
    				} else if (minIdxSum == i + j) {
    					restaurantList.add(list1[i]);
    				}
    			}
    		}
    	}
    	
    	String[] res = new String[restaurantList.size()];
    	for (int i = 0; i < restaurantList.size(); i++) {
    		res[i] = restaurantList.get(i);
    	}
    	
    	return res;
    }
}
