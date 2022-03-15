package algorithm;

public class AddStrings {
	
	public static void main(String[] args) {
		String num1 = "456";
		String num2 = "77";
		
		String res = addStrings(num1, num2);
		System.out.println(res);
	}
	
	public String getSumOfTwoStrings(String num1, String num2) {
		StringBuffer sb = new StringBuffer();
		int carry = 0;
		
		int i = num1.length() - 1;
		int j = num2.length() - 1;
		
		while (i >= 0 || j >= 0 || carry == 1) {
			
			int x = i < 0 ? 0 : num1.charAt(i) - '0';
			int y = j < 0 ? 0 : num2.charAt(j) - '0';
			
			sb.append((x + y + carry) % 10);
			carry = (x + y + carry) / 10;
			
			i--;
			j--;
		}
		
		return sb.reverse().toString();
	}


    public static String addStrings(String num1, String num2) {
    	StringBuilder sb = new StringBuilder();
    	
    	int i = num1.length() - 1;
    	int j = num2.length() - 1;
    	int increment = 0;
    	
    	while (i >= 0 && j >= 0) {
    		int digit1 = num1.charAt(i) - 48;
    		int digit2 = num2.charAt(j) - 48;
    		
    		int sum = digit1 + digit2 + increment;
    		increment = 0;
    		
    		if (sum > 10) {
    			increment++;
    			sb.append(sum % 10);
    		} else {
    			sb.append(sum);
    		}
    		i--;
    		j--;
    	}
    	
    	while (i >= 0) {
    		int digit1 = num1.charAt(i) - 48;
    		int sum = digit1 + increment;
    		increment = 0;
    		
    		if (sum > 10) {
    			increment++;
    			sb.append(sum / 10);
    		} else {
    			sb.append(sum);
    		}
    		i--;
    	}
    	
    	while (j >= 0) {
    		int digit2 = num2.charAt(j) - 48;
    		int sum = digit2 + increment;
    		increment = 0;
    		
    		if (sum > 10) {
    			increment++;
    			sb.append(sum / 10);
    		} else {
    			sb.append(sum);
    		}
    		j--;
    	}
    	
    	return sb.reverse().toString();
    }
}
