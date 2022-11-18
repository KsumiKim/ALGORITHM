package algorithm;

public class StrongPassword {
	
	public static void main(String[] args) {
		int n = 3;
		String password = "Ab1";
		
		int n2 = 11;
		String password2 = "#HackerRank";
		
		int res = minimumNumber(n2, password2);
		System.out.println(res);
	}

    public static int minimumNumber(int n, String password) {
    	String specialCharacters = "!@#$%^&*()-+";
    	boolean containsNumber = false, containsLowercase = false, containsUppercase = false, containsSpecial = false;
    	int count = password.length() < 6 ? 6 - password.length() : 0;
    	int numberNeeded = 4;
    	
    	for (char c : password.toCharArray()) {
    		if (!containsNumber && c >= 48 && c <= 57) {
    			containsNumber = true;
    			numberNeeded--;
    			continue;
    		}
    		if (!containsLowercase && c >= 65 && c <= 90) {
    			containsLowercase = true;
    			numberNeeded--;
    			continue;
    		}
    		if (!containsUppercase && c >= 97 && c <= 122) {
    			containsUppercase = true;
    			numberNeeded--;
    			continue;
    		}
    		if (!containsSpecial && specialCharacters.indexOf(c) >= 0) {
    			containsSpecial = true;
    			numberNeeded--;
    		}
    	}
    	return count > numberNeeded ? count : numberNeeded;
    }
}
