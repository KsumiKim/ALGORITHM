package algorithm;

public class MaxNumberOfWords {
	
	public static void main(String[] args) {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		String[] sentences2 = {"please wait", "continue to fight", "continue to win"};
		
		int res = mostWordsFound(sentences2);
		System.out.println(res);
	}
	
    public static int mostWordsFound(String[] sentences) {
		int maxLength = 0;
		
    	for (String sentence : sentences) {
    		String[] words = sentence.split("\\s");
    		maxLength = Math.max(maxLength, words.length);
    	}
    	return maxLength;
    }

}
