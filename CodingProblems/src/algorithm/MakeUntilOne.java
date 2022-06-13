package algorithm;

public class MakeUntilOne {

	public static void main(String[] args) {
		int n = 17, k = 4;
		int res = minNumberToMakeOne(n, k);
		System.out.println(res);
	}
	
	public static int minNumberToMakeOne(int n, int k) {
		int count = 0;
		
		while (n > 1) {
			if (n % k == 0) {
				n /= k;
			} else {
				n--;
			}
			count++;
		}
		return count;
	}
	
}
