package algorithm;

public class WordsWithPrefix {

	public static void main(String[] args) {
		String[] words = {"pay","attention","practice","attend"};
		String pref = "at";
		
		String[] words2 = {"leetcode","win","loops","success"};
		String pref2 = "code";
		
		int count = prefixCount(words2, pref2);
		System.out.println(count);
	}
	
    public static int prefixCount(String[] words, String pref) {
    	int count = 0;
    	
    	for (String word : words) {
    		if (word.startsWith(pref)) {
    			count++;
    		}
    	}
    	return count;
    }
}
