package algorithm;

public class ReverseWordPrefix {

	public static void main(String[] args) {
		String word = "xyxzxe";
		char ch = 'z';
		
		String word2 = "abcd";
		char ch2 = 'z';
		
		String res = reversePrefix(word2, ch2);
		System.out.println(res);
	}
	
    public static String reversePrefix(String word, char ch) {
    	int idx = word.indexOf(ch);
    	String prefix = word.substring(0, idx + 1);
    	StringBuilder sb = new StringBuilder(prefix);
    	
    	String reversed = sb.reverse().toString();
    	return reversed + word.substring(idx + 1);
    }

}
