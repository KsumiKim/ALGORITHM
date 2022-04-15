package algorithm;

public class ThousandSeparator {
	
	public static void main(String[] args) {
		int n = 1234567;
		String res = thousandSeparator(n);
		System.out.println(res);
	}

    public static String thousandSeparator(int n) {
    	StringBuilder sb = new StringBuilder(n + "");
    	
    	for (int i = sb.length() - 3; i >= 0; i-=3) {
    		sb.insert(i, ".");
    	}
    	return sb.charAt(0) == '.' ? sb.substring(1).toString() : sb.toString();
    }
}
