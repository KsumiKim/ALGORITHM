package algorithm;

public class AlternatingCharacters {

	public static void main(String[] args) {
		String s = "AAABBB";
		int res = alternatingCharacters(s);
		System.out.println(res);
	}
	
    public static int alternatingCharacters(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	boolean alternating = true;
    	int count = 0;
    	
    	while (alternating) {
    		alternating = false;
        	for (int i = 0; i < sb.length() - 1; i++) {
        		if (sb.charAt(i) == sb.charAt(i + 1)) {
            		alternating = true;
        			sb.delete(i, i + 2);
        			count += 2;
        		}
        	}
    	}
    	return count;
    }
}
