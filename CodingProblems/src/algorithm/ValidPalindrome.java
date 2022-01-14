package algorithm;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		String s2 = "race a car";
		String s3 = " ";
		
		boolean res = isPalindrome(s3);
		System.out.println(res);
	}
	
    public static boolean isPalindrome(String s) {
    	String transformedS = s.toLowerCase().replaceAll("[^a-z]", "");
    	int i = 0, j = transformedS.length() - 1;
    	
    	while (i < j) {
    		
    		if (transformedS.charAt(i) != transformedS.charAt(j)) {
    			return false;
    		}
    		i++;
    		j--;
    	}
    	
    	return true;
    }
}
