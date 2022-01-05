package algorithm;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {

	public static void main(String[] args) {
		PerfectNumber pNumber = new PerfectNumber();
		boolean result = pNumber.isPerfectNumber(28);
		System.out.println(result);
	}
	
	// A perfect number is a positive integer 
	// that is equal to the sum of all its positive divisor
	// except itself.
    public boolean isPerfectNumber(int num) {
     
    	int result = 1;
    	
    	int n = (int)Math.sqrt(num);
    	
    	while (n > 1) {
    		
    		if (num % n == 0) {
    			result += n + (num / n);
    		}
    		n--;
    	}
    	
    	return result == num;
    }

    
    public boolean checkPerfectNumber(int num) {
    	Set<Integer> set = new HashSet<>();
    	int sum = 0;
    	
    	int i = 1;
    	
    	while(i < num / 2) {
    		
    		if (num % i == 0) {
    			set.add(i);
    			set.add(num / i);
    			sum += i + (num / i);
    		}
    	}
    	return sum == num;
    }
}
