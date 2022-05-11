package algorithm;

public class LargestSameDigit {
	
	public static void main(String[] args) {
		String num = "67771333339";
		String res = largestGoodInteger(num);
		System.out.println(res);
	}
	
    public static String largestGoodInteger(String num) {
    	String goodInteger = "";
    	
    	for (int i = 0; i < num.length() - 2; i++) {
    		char curr = num.charAt(i);
    		boolean isGood = true;
    		
    		for (int j = i; j < i + 3; j++) {
    			char next = num.charAt(j);
    			if (curr != next) {
    				isGood = false;
    				break;
    			}
    		}
    		
    		if (isGood && (goodInteger.isEmpty() || goodInteger.charAt(0) < curr)) {
    			goodInteger = num.substring(i, i + 3);
    		}
    	}
    	return goodInteger;
    }
}
