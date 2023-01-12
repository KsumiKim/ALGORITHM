package algorithm;

public class FlippingBits {

	public static void main(String[] args) {
		long n = 9;
		long n2 = 3;
		
		long res = flippingBits(n2);
		System.out.println(res);
	}
	
    public static long flippingBits(long n) {
    	return n ^ 4294967295L;
    }

}
