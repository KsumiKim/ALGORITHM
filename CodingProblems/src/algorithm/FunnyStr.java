package algorithm;

public class FunnyStr {

	public static void main(String[] args) {
		String s = "acxz";
		String s2 = "bcxz";
		
		boolean res = funnyString(s2);
		System.out.println(res);
	}
	
    public static boolean funnyString(String s) {
    	char[] charArr = s.toCharArray();
    	boolean isFunny = true;
    	
    	for (int i = 0, j = charArr.length - 1; i < charArr.length - 1; i++, j--) {
    		int diff = Math.abs((int)charArr[i] - (int)charArr[i + 1]);
    		int diff2 = Math.abs((int)charArr[j] - (int)charArr[j - 1]);
    		
    		if (diff != diff2) {
    			isFunny = false;
    			break;
    		}
    	}
    	return isFunny;
    }

}
