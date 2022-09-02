package algorithm;

public class LetterAppearTwice {

	public static void main(String[] args) {
		String s = "abccbaacz";
		String s2 = "abcdd";
		
		char res = repeatedCharacter(s2);
		System.out.println(res);
	}
	
    public static char repeatedCharacter(String s) {
    	char res = s.charAt(0);
    	
    	for (int i = 0; i < s.length() - 1; i++) {
    		if (s.charAt(i) == s.charAt(i + 1)) {
    			res = s.charAt(i);
    			break;
    		}
    	}
    	return res;
    }

}
