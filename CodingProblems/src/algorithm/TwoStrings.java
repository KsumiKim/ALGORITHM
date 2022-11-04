package algorithm;

public class TwoStrings {
	
	public static void main(String[] args) {
		String s1 = "and", s2 = "art";
		String s3 = "be", s4 = "cat";
		
		boolean res = hasSubstring(s3, s4);
		System.out.println(res);
	}

    public static boolean hasSubstring(String s1, String s2) {
    	boolean contains = false;
    	int[] arr = new int[26];
    	
    	for (char c : s1.toCharArray()) {
    		arr[c - 97]++;
    	}
    	
    	for (char c : s2.toCharArray()) {
    		if (arr[c - 97] > 0) {
    			contains = true;
    			break;
    		}
    	}
    	return contains;
    }
}
