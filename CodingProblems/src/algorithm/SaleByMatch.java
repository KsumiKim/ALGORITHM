package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SaleByMatch {

	public static void main(String[] args) {
		int n = 7;
		List<Integer> socks = Arrays.asList(1, 2, 1, 2, 1, 3, 2);
		
		int n2 = 7;
		List<Integer> socks2 = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		
		int res = sockMerchant(n2, socks2);
		System.out.println(res);
	}
	
    public static int sockMerchant(int n, List<Integer> socks) {
    	Map<Integer, Integer> map = new HashMap<>();
    	int pair = 0;
    	
    	for (int sock : socks) {
    		map.put(sock, map.getOrDefault(sock, 0) + 1);
    	}
    	
    	for (int key : map.keySet()) {
    		int count = map.get(key);
			pair += (count / 2);
    	}
    	return pair;
    }

}
