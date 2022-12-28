package algorithm;

public class TwoDifferentStrings {

	public static void main(String[] args) {
		String s1 = "hello", s2 = "world";
		String s3 = "hi", s4 = "world";
		
		boolean res = containsSubstring(s3, s4);
		System.out.println(res);
	}
	
    public static boolean containsSubstring(String s1, String s2) {
    	int[] arr = new int[26];
    	boolean contains = false;
    	
    	for (int i = 0; i < s1.length(); i++) {
    		arr[s1.charAt(i) - 97]++;
    	}
    	
    	for (int i = 0; i < s2.length(); i++) {
    		if (arr[s2.charAt(i) - 97] > 0) {
    			contains = true;
    			break;
    		}
    	}
    	return contains;
    }

}
