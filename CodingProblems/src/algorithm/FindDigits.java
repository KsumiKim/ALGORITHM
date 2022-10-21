package algorithm;

public class FindDigits {

	public static void main(String[] args) {
		int n = 12;
		int n2 = 1012;
		
		int res = findDigits(n2);
		System.out.println(res);
	}
	
    public static int findDigits(int n) {
    	int digitCount = 0;
    	int num = n;
    	
    	while (num >= 10) {
    		int digit = num % 10;

    		if (digit != 0 && n % digit == 0) {
        		digitCount++;
    		}
    		num /= 10;
    	}
		if (n % num == 0) {
    		digitCount++;
		}
    	return digitCount;
    }

}
