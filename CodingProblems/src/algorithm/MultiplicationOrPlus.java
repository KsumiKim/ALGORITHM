package algorithm;

public class MultiplicationOrPlus {

	public static void main(String[] args) {
		String S = "02984";
		String S2 = "576";
		
		int res = getMaxNumber(S2);
		System.out.println(res);
	}
	
	public static int getMaxNumber(String S) {
		int maxNumber = 1;
		
		for (char c : S.toCharArray()) {
			int n = c - '0';
			if (n <= 1) {
				maxNumber += n;
			} else {
				maxNumber *= n;
			}
		}
		return maxNumber;
	}
	
}
