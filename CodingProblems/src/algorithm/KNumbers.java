package algorithm;

public class KNumbers {

	public static void main(String[] args) {
		int p = 5, q = 1;
		boolean res = kaprekarNumbers(p, q);
		System.out.println(res);
	}
	
    public static boolean kaprekarNumbers(int p, int q) {
    	int squared = p * p;
    	
    	String squaredStr = Integer.toString(squared);
    	int sum = Integer.parseInt(squaredStr.substring(0, q)) + Integer.parseInt(squaredStr.substring(q));
    	
    	return sum == p;
    }

}
