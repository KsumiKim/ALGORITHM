package algorithm;

public class FirstPalindrome {

	public static void main(String[] args) {
		String[] words = {"abc","car","ada","racecar","cool"};
		String[] words2 = {"notapalindrome","racecar"};
		
		String res = firstPalindrome(words2);
		System.out.println(res);
	}
	
    public static String firstPalindrome(String[] words) {
    	String res = "";
    	
    	for (String word : words) {
    		StringBuilder sb = new StringBuilder(word);
    		
    		if (sb.reverse().toString().equals(word)) {
    			res = word;
    			break;
    		}
    	}
    	return res;
    }
}
