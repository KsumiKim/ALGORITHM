package algorithm;

public class ExcelTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
    	boolean isDivisor = false;
    	
    	while (columnNumber > 26) {
    		int mod = columnNumber % 26;
    		columnNumber /= 26;
    		
    		if (mod == 0) {
    			sb.append((char)(26 + 64));
    			isDivisor = true;
    		}
    		else 
    			sb.append((char)(mod + 64));
    	}
    	if (isDivisor) 
    		sb.append((char)(columnNumber + 63));
    	else 
    		sb.append((char)(columnNumber + 64));

    	return sb.reverse().toString();
    }
    
    public String convertToTitle2(int columnNumber) {
    	int[] titleArr = new int[26];
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while (columnNumber > 26) {
    		
    		int val = columnNumber / 26;
    		int mod = columnNumber % 26;
    		
    		if (val > 1) {
        		sb.append((char)titleArr[val] + 65);
    		}
    		sb.append((char)titleArr[mod] + 65);
    		columnNumber /= 26;
    	}
    	
    	return sb.toString();
    }
    
}
