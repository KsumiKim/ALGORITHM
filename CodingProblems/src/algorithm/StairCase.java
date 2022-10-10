package algorithm;

public class StairCase {

	public static void main(String[] args) {
		int n = 6;
		staircase(n);
	}
	
    public static void staircase(int n) {

		for (int i = 0; i < n; i++) {
			
			for (int j = n - 1; j >= 0; j--) {
				if (i >= j) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }

}
