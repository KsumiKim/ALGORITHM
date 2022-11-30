package algorithm;

public class PalindromeGame {

	public static void main(String[] args) {
		String s = "aaabbbb";
		String s2 = "cdefghmnopqrstuvw";
		String s3 = "cdcdcdcdeeeef";
		
		boolean res = isPalindrome(s3);
		System.out.println(res);
	}
	
    public static boolean isPalindrome(String s) {
    	int[] arr = new int[26];
    	
    	for (char c : s.toCharArray()) {
    		arr[c - 97]++;
    	}
    	
    	int oddCount = 0;

    	for (int n : arr) {
    		if (n % 2 != 0) {
    			oddCount++;
    		}
    	}
    	return oddCount < 2;
    }
}
