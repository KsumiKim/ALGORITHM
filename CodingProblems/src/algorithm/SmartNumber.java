package algorithm;

public class SmartNumber {

	public static void main(String[] args) {
		int num = 4;
		int num2 = 169;
		int num3 = 7;
		
		boolean res = isSmartNumber(num3);
		System.out.println(res);
	}
	
    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        boolean result = false;

        if (num % val == 0) {
        	result = true;
        }
        return result;
    }
}
