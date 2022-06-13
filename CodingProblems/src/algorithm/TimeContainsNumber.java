package algorithm;

public class TimeContainsNumber {
	
	public static void main(String[] args) {
		int n = 3;
		
		int res = countTimeContainingNumber(n);
		System.out.println(res);
	}

	public static int countTimeContainingNumber(int n) {
		int count = 0;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					if (containsN(i, j, k, n)) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	private static boolean containsN(int i, int j, int k, int n) {
		return i % 10 == n || j % 10 == n || j / 10 == n || k % 10 == n || k / 10 == n;
	}
}
