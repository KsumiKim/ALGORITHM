package algorithm;

public class DetectCapital {

	public static void main(String[] args) {
		String word = "Google";
		String word2 = "USA";
		String word3 = "FlaG";
		String word4 = "leetcode";
		String word5 = "ffffffffffffffffffffF";
		
		DetectCapital cap = new DetectCapital();
		boolean result = cap.detectCapitalUse(word);
		System.out.println(result);
	}
	
	public boolean canDetectCapital(String str) {
		// a given string is capital if it falls in one of below categories
		// 1. all uppercase. i.e.) USA
		// 2. all lowercase. i.e.) chocolate
		// 3. all lowercase except the first letter. i.e.) Google
		
		int capCount = 0;
		
		for (char c : str.toCharArray()) {
			
			if ('Z' - c >= 0)
				capCount++;
		}
		
		return capCount == 0 || capCount == str.length() || (capCount == 1 && 'Z' - str.charAt(0) >= 0);
	}

    public boolean detectCapitalUse(String word) {
        boolean isAllCap = true;
        boolean isAllLow = true;
        boolean isCamel = true;
        
        for (int i = 0; i < word.length(); i++) {
        	char curr = word.charAt(i);
        	if (Character.isUpperCase(curr)) {
        		isAllLow = false;
        	} 
        	if (i > 0 && Character.isUpperCase(curr)) {
        		isCamel = false;
        	} 
        	if (Character.isLowerCase(curr)) {
        		isAllCap = false;
        	}
        }
    	return isAllCap || isAllLow || isCamel;
    }
}
