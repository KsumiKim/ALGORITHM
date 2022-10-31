package algorithm;

public class SuperReducedString {
	
	public static void main(String[] args) {
		String s = "aaabccddd";
		String s2 = "aaa";
		String s3 = "baab";
		
		String res = superReducedString(s3);
		System.out.println(res);
	}

    public static String superReducedString(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	boolean reduced = true;
    	
    	while (reduced) {
        	int i = 0;
        	reduced = false;

        	while (i < sb.length()) {
    	    	char start = sb.charAt(i);
    	    	int next = sb.indexOf(start + "", i + 1);
    	    	if (next > -1 && i + 1 == next) {
    	    		reduced = true;
    	    		sb.delete(i, next + 1);
    	    	};
    	    	i++;
        	}
    	}
    	return sb.toString();
    }
}
