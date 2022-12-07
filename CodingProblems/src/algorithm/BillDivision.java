package algorithm;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
	
	public static void main(String[] args) {
		List<Integer> bill = Arrays.asList(3, 10, 2, 9);
		int k = 1, b = 7;
		
		List<Integer> bill2 = Arrays.asList(3, 10, 2, 9);
		int k2 = 1, b2 = 12;
		
		int res = bonAppetit(bill2, k2, b2);
		System.out.println(res);
	}

    public static int bonAppetit(List<Integer> bill, int k, int b) {
    	int totalCharged = 0;
    	
    	for (int i = 0; i < bill.size(); i++) {
    		if (i == k) {
    			continue;
    		}
    		totalCharged += bill.get(i);
    	}
    	int annaCharged = totalCharged / 2;
    	
    	return b > annaCharged ? b - annaCharged : 0;
    }

}
