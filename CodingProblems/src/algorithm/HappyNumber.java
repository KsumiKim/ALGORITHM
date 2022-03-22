package algorithm;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 7;
		
		boolean res = isHappy(n);
		System.out.println(res);
	}
	
    public static boolean isHappy(int n) {
    	boolean isHappy = true;
    	
    	while (isHappy) {
    		int temp = n;
    		int sum = 0;
    		
    		while (true) {
    			
    			int mod = temp % 10;
    			sum += Math.pow(mod, 2);
    			temp /= 10;
    			
    			if (temp < 10) {
    				sum += Math.pow(temp, 2);
    				break;
    			}
    		}
    		if (sum == 2 || sum == 3)  {
    			isHappy = false;
    		}
    		n = sum;
    	}
    	return n == 1;
    }
}
