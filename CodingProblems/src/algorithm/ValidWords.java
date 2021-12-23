package algorithm;

public class ValidWords {
	
	public static void main(String[] args) {
		String sentence = "cat and  dog";
		String sentence2 = "!this  1-s b8d!";
		
		int res = countValidWords(sentence);
		System.out.println(res);
	}
	
	
    public static int countValidWords(String sentence) {
    	String[] words = sentence.split("\\s");
    	String pattern = "[a-z]+(-?[a-z]+)?[!,\\.]?";
    	int count = 0;
    	
    	for (String word : words) {
    		if (word.matches(pattern)) {
    			count++;
    		}
    	}
    	
    	return count;
    }
}
