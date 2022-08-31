package algorithm;

public class ReversePrefix {

	public static void main(String[] args) {
		String word = "abcdefd"; 
		char ch = 'd';
		
		String res = reversePrefix(word, ch);
		System.out.println(res);
	}
	
    public static String reversePrefix(String word, char ch) {
    	StringBuilder sb = new StringBuilder(word);
    	
    	int firstOccurrenceIdx = sb.indexOf(ch + "");
    	sb.setCharAt(firstOccurrenceIdx, sb.charAt(0));
    	sb.setCharAt(0, ch);
    	
    	return sb.toString();
    }

}
