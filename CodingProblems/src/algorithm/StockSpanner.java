package algorithm;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {
	
	public static void main(String[] args) {
		StockSpanner stockSpanner = new StockSpanner();
		System.out.println(stockSpanner.next(100));
		System.out.println(stockSpanner.next(80));
		System.out.println(stockSpanner.next(60));
		System.out.println(stockSpanner.next(70));
		System.out.println(stockSpanner.next(60));
		System.out.println(stockSpanner.next(75));
		System.out.println(stockSpanner.next(85));
	}
	
	List<Integer> span;
	
    public StockSpanner() {
        span = new ArrayList<>();
    }
    
    public int next(int price) {
        span.add(price);
        int count = 0;

        for (int i = span.size() - 1; i >= 0; i--) {
        	if (span.get(i) > price) 
        		break;
    		count++;
        }
    	
    	return count;
    }
}
