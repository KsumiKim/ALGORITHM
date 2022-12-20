package algorithm;

public class SherlockSquare {

	public static void main(String[] args) {
		int a = 24, b = 49;
		int a2 = 3, b2 = 9;
		int a3 = 17, b3 = 24;
		
		int res = squares(a3, b3);
		System.out.println(res);
	}
	
    public static int squares(int a, int b) {
    	int count = 0;
    	
    	for (int i = a; i <= b; i++) {
    		if (isSquare(i)) {
    			count++;
    		}
    	}
    	return count;
    }
    
    private static boolean isSquare(int n) {
    	double sqrt = Math.sqrt(n);
    	return sqrt == (int)sqrt;
    }

}
