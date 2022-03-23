package algorithm;

public class ConvertString {
	
	public static void main(String[] args) {
		String s = "XXX";
		String s2 = "XXOX";
		String s3 = "OOOO";
		String s4 = "OXOX";
		String s5 = "XXXXX";
		
		int res = minimumMoves(s5);
		System.out.println(res);
	}

    public static int minimumMoves(String s) {
    	if (s.indexOf("X") < 0) {
    		return 0;
    	}
    	
    	int res = 0;
		StringBuilder sb = new StringBuilder(s);
		
    	for (int i = 0; i < s.length(); i++) {
    		
    		if (sb.charAt(i) != 'X') {
    			continue;
    		}
    		
    		for (int j = i; j < i + 3 && j < s.length(); j++) {
    			
    			if (sb.charAt(j) == 'X') {
    				sb.setCharAt(j, 'O');
    			}
    		}
    		res++;
    		if (sb.indexOf("X") < 0) {
    			break;
    		}
    	}
    	return res;
    }
}
