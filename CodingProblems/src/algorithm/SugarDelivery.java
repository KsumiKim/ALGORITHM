package algorithm;

public class SugarDelivery {
	
	public static void main(String[] args) {
		int n = 18;
		int n2 = 4;
		int n3 = 6;
		int n4 = 9;
		int n5 = 11;
		
		int res = minNumberOfSugarBag(n5);
		System.out.println(res);
	}

	public static int minNumberOfSugarBag(int n) {
		int min = 0;
		
		while (n >= 0) {
			if (n % 5 == 0) {
				min += n / 5;
				n %= 5;
				break;
			}
			n -= 3;
			min++;
		}
		return n == 0 ? min : -1;
	}
}
