package algorithm;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		String b = "0100101010";
		int res = beautifulBinaryString(b);
		System.out.println(res);
	}
	
    public static int beautifulBinaryString(String b) {
    	String beautifulBinary = "010";
    	StringBuilder sb = new StringBuilder(b);
    	boolean contains = true;
    	int count = 0;
    	
    	while (sb.length() > 0 && contains) {
    		boolean has = false;
    		
    		int idx = sb.indexOf(beautifulBinary);
    		if (idx >= 0) {
        		sb.delete(idx, idx + beautifulBinary.length());
        		has = true;
        		count++;
    		}
    		contains = has;
    	}
    	return count;
    }

}
