package algorithm;

public class PlusOne {
	
	public static void main(String[] args) {
		int[] digits = {9};
		int[] digits2 = {1, 2, 3};
		int[] digits3 = {4, 3, 2, 1};
		
		int[] res = plusOne(digits3);
		
		for (int n : res) {
			System.out.print(n + ", ");
		}
	}

    public static int[] plusOne(int[] digits) {
    	StringBuilder sb = new StringBuilder();
    	boolean greaterThan10 = true;
    	
    	for (int i = digits.length - 1; i >= 0; i--) {
    		int curr = digits[i] + (greaterThan10 ? 1 : 0);
    		
    		if (curr >= 10) {
    			greaterThan10 = true;
    			sb.append(curr % 10);
    		} else {
    			sb.append(curr);
    			greaterThan10 = false;
    		}
    	}
    	
    	if (greaterThan10) {
    		sb.append("1");
    	}
    	sb.reverse();
    	
    	int[] result = new int[sb.length()];
    	for (int i = 0; i < sb.length(); i++) {
    		result[i] = Integer.parseInt(sb.charAt(i) + "");
    	}
    	
    	return result;
    }
}
