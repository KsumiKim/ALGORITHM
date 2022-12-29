package algorithm;

public class SRString {

	public static void main(String[] args) {
		String s = "aaabccddd";
		String s2 = "aa";
		
		String res = superReducedString(s2);
		System.out.println(res);
	}
	
    public static String superReducedString(String s) {
    	StringBuilder sb = new StringBuilder(s);
    	int idx = 0;
    	
    	while (idx < sb.length()) {
    		char c = sb.charAt(idx);
    		int nextIdx = sb.indexOf(c + "", idx + 1);

    		if (nextIdx == idx + 1) {
    			sb.delete(idx, idx + 2);
    		}
    		idx++;
    	}
    	return sb.toString();
    }

}
