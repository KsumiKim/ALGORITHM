package algorithm;

public class MinChanges {
	
	public static void main(String[] args) {
		int n = 1260;
		int res = getMinimunChanges(n);
		System.out.println(res);
	}

	public static int getMinimunChanges(int n) {
		int[] changes = {500, 100, 50, 10};
		int min = 0;
		
		for (int i = 0; i < changes.length; i++) {
			min += n / changes[i];
			n %= changes[i];
		}
		
		return min;
	}
}
