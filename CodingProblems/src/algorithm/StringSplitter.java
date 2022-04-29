package algorithm;

import java.math.BigInteger;

public class StringSplitter {

	public static void main(String[] args) {
		String s = "00110001011111100111101010100010001101001110";
		String s2 = "011101";
		int res = maxScore(s);
		System.out.println(res);
	}
	/*
	 * Given a string s of zeros and ones, 
	 * return the maximum score after splitting the string into 
	 * two non-empty substrings (i.e. left substring and right substring).
	 * The score after splitting a string is the number of zeros in the left 
	 * substring plus the number of ones in the right substring.
	 */
    public static int maxScore(String s) {
    	int zeroCount = 0, oneCount = 0, max = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '0') {
    			zeroCount++;
    		} else {
    			oneCount++;
    		}
    		max = Math.max(max, zeroCount - oneCount);
    	}
    	return max + oneCount;
    }
}
