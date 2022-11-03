package algorithm;

public class FunnyString {

	public static void main(String[] args) {
		String s = "lmnop";
		boolean res = isFunnyString(s);
		System.out.println(res);
	}
	
    public static boolean isFunnyString(String s) {
    	char[] letters = new char[s.length()];
    	
    	for (int i = 0; i < letters.length; i++) {
    		letters[i] = s.charAt(i);
    	}
    	
    	int diff1 = -1, diff2 = -1;
    	boolean isFunny = true;
    	
    	for (int i = 0, j = letters.length - 1; i < letters.length - 1; i++, j--) {
    		if (i == 0) {
    			diff1 = Math.abs(letters[i] - letters[i + 1]);
    			diff2 = Math.abs(letters[j] - letters[j - 1]);
    			continue;
    		}
    		
    		if (Math.abs(letters[i] - letters[i + 1]) != diff1) {
    			isFunny = false;
    			break;
    		}

    		if (Math.abs(letters[j] - letters[j - 1]) != diff2) {
    			isFunny = false;
    			break;
    		}
    	}
    	return isFunny;
    }
}
