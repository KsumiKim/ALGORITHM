package algorithm;

import java.util.Arrays;

public class ElectronicShop {
	
	public static void main(String[] args) {
		int[] keyboards = {40, 50, 60};
		int[] drives = {5, 8, 12};
		int b = 60;
		
		int res = getMoneySpent(keyboards, drives, b);
		System.out.println(res);
	}

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    	Arrays.sort(keyboards);
    	Arrays.sort(drives);
    	int moneySpent = -1;
    	
    	for (int i = keyboards.length - 1; i >= 0; i--) {
    		if (keyboards[i] >= b) {
    			continue;
    		}
    		
    		for (int j = drives.length - 1; j >= 0; j--) {
    			if (keyboards[i] + drives[j] <= b) {
    				moneySpent = keyboards[i] + drives[j];
    		    	return moneySpent;
    			}
    		}
    	}
    	return moneySpent;
    }

}
