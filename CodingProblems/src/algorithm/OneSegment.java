package algorithm;

public class OneSegment {
	
	public static void main(String[] args) {
		String s = "1001";
		String s2 = "110";
		String s3 = "1000";
		String s4 = "10110000";
		
		boolean res = checkOnesSegment(s4);
		System.out.println(res);
	}
	
    public static boolean checkOnesSegment(String s) {
    	
    	for (int i = 1; i < s.length() - 1; i++) {
    		if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
    			return false;
    		}
    	}
    	return true;
    }

}
