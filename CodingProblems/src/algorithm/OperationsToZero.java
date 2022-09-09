package algorithm;

public class OperationsToZero {
	
	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		
		int res = countOperations(num1, num2);
		System.out.println(res);
	}

    public static int countOperations(int num1, int num2) {
		if (num1 == num2) {
			return 1;
		}

		int count = 0;
    	while (true) {
    		int subtract = 0;
    		
    		if (num1 == 0 || num2 == 0) {
    			break;
    		}
    		
    		if (num1 > num2) {
    			subtract = num1 - num2;
    			num1 = subtract;
    		} else {
    			subtract = num2 - num1;
    			num2 = subtract;
    		}
    		count++;
		}
    	return count;
    }

}
