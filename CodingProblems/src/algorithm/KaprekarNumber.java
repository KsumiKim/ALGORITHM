package algorithm;

public class KaprekarNumber {
	
	public static void main(String[] args) {
		int p = 9, q = 1;
		
		boolean res = isKaprekarNumbers(p, q);
		System.out.println(res);
	}

    public static boolean isKaprekarNumbers(int p, int q) {
    	int squared = p * p;
    	int sum = 0;
    	
    	while (squared >= 10) {
    		sum += squared % 10;
    		squared /= 10;
    		
    		if (squared < 10) {
        		sum += squared;
    		}
    	}
    	
    	String numStr = Integer.toString(squared);
    	boolean isKaprekar = false;
    	
    	for (int i = 0; i < numStr.length(); i++) {
    		int n = Integer.parseInt(numStr.charAt(i) + "");
    		sum -= n;
    		
    		if (sum == p) {
    			isKaprekar = true;
    			break;
    		}
    	}
    	return isKaprekar;
    }

}
