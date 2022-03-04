package algorithm;

public class RangedCoveredIntegers {
	
	public static void main(String[] args) {
		int[][] ranges = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		boolean res = isCovered(ranges, 2, 5);
		System.out.println(res);
	}
	
    public static boolean isCovered(int[][] ranges, int left, int right) {
    	
    	for (int i = 0; i < ranges.length; i++) {
    		
    		while (left >= ranges[i][0] && left <= ranges[i][1]) {
    			left++;
    		}
    		
    		if (left == right) {
    			break;
    		}
    	}
    	
    	return ranges[ranges.length - 1][1] >= right && left == right;
    }
}
