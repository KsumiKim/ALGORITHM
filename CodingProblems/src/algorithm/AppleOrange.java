package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleOrange {
	
	public static void main(String[] args) {
		int s = 7, t = 11, a = 5, b = 15;
		List<Integer> apples = Arrays.asList(-2, 2, 1);
		List<Integer> oranges = Arrays.asList(5, -6);
		
		int res = countApplesAndOranges(s, t, a, b, apples, oranges);
		System.out.println(res);
	}

    public static int countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    	List<Integer> locations = new ArrayList<>();
    	int count = 0;
    	
    	for (int apple : apples) {
    		locations.add(a + apple);
    	}
    	
    	for (int orange : oranges) {
    		locations.add(b + orange);
    	}
    	
    	for (int location : locations) {
    		if (location >= 7 && location <= t) {
    			count++;
    		}
    	}
    	return count;
    }

}
