package algorithm;

public class ContinuousSegment {
	
	public static void main(String[] args) {
		String s = "1101";
		String s2 = "111000";
		String s3 = "110100010";
		String s4 = "011000111";
		
		boolean res = checkZeroOnes(s4);
		System.out.println(res);
	}

    public static boolean checkZeroOnes(String s) {
    	int oneMax = 0, zeroMax = 0, oneCount = 0, zeroCount = 0;
    	boolean isOne = s.charAt(0) == '1';
    	
    	for (char c : s.toCharArray()) {
    		if (isOne && c == '0') {
    			oneMax = Math.max(oneCount, oneMax);
    			oneCount = 0;
    			isOne = false;
    		}
    		if (!isOne && c == '1') {
    			zeroMax = Math.max(zeroCount, zeroMax);
    			zeroCount = 0;
    			isOne = true;
    		}
    		
    		if (isOne) {
    			oneCount++;
    		} else {
    			zeroCount++;
    		}
    	}
		oneMax = Math.max(oneCount, oneMax);
		zeroMax = Math.max(zeroCount, zeroMax);
    	return oneMax > zeroMax;
    }
}
