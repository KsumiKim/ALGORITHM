package algorithm;

public class OddNumbers {

	public static void main(String[] args) {
		int low = 14, high = 17;
		int res = countOdds2(low, high);
		System.out.println(res);
	}
	
    public static int countOdds(int low, int high) {
    	int count = 0;
    	
    	while (low <= high) {
    		if (low % 2 != 0) 
    			count++;
    		low++;
    	}
    	return count;
    }
    
    public static int countOdds2(int low, int high) {
    	int oddNumber = low % 2 == 0 ? low + 1 : low;
    	int count = 0;
    	
    	while (oddNumber <= high) {
    		count++;
    		oddNumber += 2;
    	}
    	return count;
    }
}
