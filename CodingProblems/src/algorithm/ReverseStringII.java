package algorithm;

public class ReverseStringII {

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		
		String s2 = "abcde";
		int k2 = 2;
		
		String s3 = "abcd";
		int k3 = 2;
		
		String s4 = "abcd";
		int k4 = 4;
		
		ReverseStringII reverse = new ReverseStringII();
		String result = reverse.reverseStr(s, k);
		System.out.println(result);
	}
	
	public String reverseString(String s, int k) {
		
		// reverse the first k characters for every 2k characters
		
		// less than k characters left, reverse all of them 
		
		// less than 2k but greater than or equal to k characters, 
		// reverse the first k characters only
		
		char[] strToCharStr = s.toCharArray();
		
		for (int start = 0; start < strToCharStr.length; start += 2 * k) {
			int i = start; 
			int j = Math.min(start + k - 1, strToCharStr.length - 1);
			
			while (i < j) {
				char temp = strToCharStr[i];
				strToCharStr[i++] = strToCharStr[j];
				strToCharStr[j--] = temp;
			}
		}
		return new String(strToCharStr);
	}

	
    public String reverseStr(String s, int k) {
    	StringBuilder sb = new StringBuilder(s);
    	
    	for (int i = 0; i < sb.length(); i++) {
    		
    		if (i % (k * 2) == 0) {
    			int endIdx = i + k > sb.length() ? sb.length() : i + k;
        		StringBuilder substr = new StringBuilder(sb.substring(i, endIdx));
        		substr.reverse();
        		sb.replace(i, i + k, substr.toString());
    		}
    	}
    	return sb.toString();
    }
}
