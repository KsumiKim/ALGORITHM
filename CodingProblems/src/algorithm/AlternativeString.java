package algorithm;

public class AlternativeString {
	
	public static void main(String[] args) {
		String word1 = "abc", word2 = "pqr";
		
		String res = mergeAlternately(word1, word2);
		System.out.println(res);
	}

    public static String mergeAlternately(String word1, String word2) {
    	StringBuilder sb = new StringBuilder();
    	int idx1 = 0, idx2 = 0;
    	
    	while (idx1 < word1.length() && idx2 < word2.length()) {
			sb.append(word1.charAt(idx1));
			sb.append(word2.charAt(idx2));
			idx1++;
			idx2++;
    	}
    	
    	if (idx1 < word1.length()) {
			sb.append(word1.charAt(idx1));
			idx1++;
    	}

    	if (idx2 < word2.length()) {
			sb.append(word2.charAt(idx2));
			idx2++;
    	}
    	return sb.toString();
    }

}
