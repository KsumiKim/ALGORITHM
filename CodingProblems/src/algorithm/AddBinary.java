package algorithm;

public class AddBinary {

    public String addBinary(String a, String b) {
    	int intA = 1, intB = 1;
    	
    	for (int i = a.length() - 1; i >= 0; i--) {
    		if (a.charAt(i) == '0')
    			continue;
    		
    		intA += Math.pow(2, a.length() - i - 1);
    	}

    	for (int i = 0; i < b.length(); i++) {
    		if (b.charAt(i) == '0')
    			continue;
    		intB += Math.pow(2, b.length() - i - 1);
    	}
    	return Integer.toBinaryString(intA + intB);
    }
}
