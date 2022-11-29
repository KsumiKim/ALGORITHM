package algorithm;

public class CasesarCipher {

	public static void main(String[] args) {
		String s = "middle-Outz";
		int k = 2;
		
		String res = caesarCipher(s, k);
		System.out.println(res);
	}
	
    public static String caesarCipher(String s, int k) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (char c : s.toCharArray()) {
    		if (c == '-') {
    			sb.append('-');
    			continue;
    		}

    		int ciphered = (int)c + k;

			if (ciphered < 97) {
				int sum = ciphered % 90;
				if (sum < 65) {
	    			sb.append((char)(sum + 64));
				} else {
	    			sb.append((char)(sum));
				}
    		} else {
				int sum = ciphered % 122;
				if (sum < 97) {
	    			sb.append((char)(sum + 96));
				} else {
	    			sb.append((char)(sum));
				}
    		}
    	}
    	return sb.toString();
    }

}
