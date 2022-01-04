package algorithm;

public class StrStr {
	
	public static void main(String[] args) {
		String haystack = "hello", needle = "ll";
		String haystack2 = "", needle2 = "";
		
		int res = strStr(haystack2, needle2);
		System.out.println(res);
	}
	

    public static int strStr(String haystack, String needle) {
    	if (needle.isEmpty())
    		return 0;
    	
    	return haystack.indexOf(needle);
    }
}
