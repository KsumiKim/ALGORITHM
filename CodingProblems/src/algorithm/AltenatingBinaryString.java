package algorithm;

public class AltenatingBinaryString {
	
	public static void main(String[] args) {
		String s = "0100";
		
		int res = minOperations(s);
		System.out.println(res);
	}

    public static int minOperations(String s) {
        int res = 0, n = s.length();
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) - '0' != i % 2) {
        		res++;
        	}
        }

        return Math.min(res, n - res);
    }
}
