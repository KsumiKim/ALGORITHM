package algorithm;

public class PrefixCount {
	
	public static void main(String[] args) {
		String[] words = {"a","b","c","ab","bc","abc"};
		String s = "abc";
		
		String[] words2 = {"a","a"};
		String s2 = "aa";
		
		int res = countPrefixes(words2, s2);
		System.out.println(res);
	}

    public static int countPrefixes(String[] words, String s) {
    	int prefixCount = 0;
    	
    	for (String word : words) {
    		if (s.startsWith(word)) {
    			prefixCount++;
    		}
    	}
    	return prefixCount;
    }

}
