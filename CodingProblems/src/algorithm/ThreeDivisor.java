package algorithm;

public class ThreeDivisor {

	public static void main(String[] args) {
		int n = 81;
		
		boolean result = isThree(n);
		System.out.println(result);
	}
	
    public static boolean isThree(int n) {
    	if (n < 4) {
    		return false;
    	}
    	double sqrt = Math.sqrt(n);
    	if (sqrt * sqrt < n) {
    		return false; 
    	}
    	
    	int i = 2;
    	while (i < sqrt) {
    		if (n % i == 0) {
    			return false;
    		}
    		i++;
    	}
    	return true;
    }
}
