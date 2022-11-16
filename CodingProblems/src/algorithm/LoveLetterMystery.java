package algorithm;

public class LoveLetterMystery {

	public static void main(String[] args) {
		String s = "abc";
		String s2 = "abcba";
		String s3 = "abcd";
		String s4 = "cba";
		
		int res = theLoveLetterMystery(s3);
		System.out.println(res);
	}
	
    public static int theLoveLetterMystery(String s) {
    	int reducedCount = 0, extraOne = s.length() % 2 == 0 ? 0 : 1;
    	for (int i = 0, j = s.length() - 1; i < s.length() / 2 + extraOne; i++, j--) {
    		System.out.println((int)s.charAt(i) + " " +  (int)s.charAt(j));
    		if (s.charAt(i) != s.charAt(j)) {
        		reducedCount += Math.abs((int)s.charAt(i) - (int)s.charAt(j));
    		}
    	}
    	return reducedCount;
    }

}
