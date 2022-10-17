package algorithm;

public class BeautifulDays {

	public static void main(String[] args) {
		int i = 20, j = 23, k = 6;
		
		int res = beautifulDays(i, j, k);
		System.out.println(res);
	}
	
    public static int beautifulDays(int i, int j, int k) {
    	int daysCount = 0;
    	
    	while (i++ < j + 1) {
    		StringBuilder sb = new StringBuilder(Integer.toString(i));
    		int reversed = Integer.parseInt(sb.reverse().toString());
    		int output = Math.abs(i - reversed) / k;
    		
    		if (output == Math.abs((double)i - (double)reversed) / (double)k) {
    			daysCount++;
    		}
    	}
    	return daysCount;
    }

}
