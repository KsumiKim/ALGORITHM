package algorithm;

public class TeemoAttacking {
	
	public static void main(String[] args) {
		int[] timeSeries = {1, 4};
		int duration = 2;
		
		int[] timeSeries2 = {1, 2};
		int duration2 = 2;
		
		
		int res = findPoisonedDuration(timeSeries2, duration2);
		System.out.println(res);
	}
	
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
    	int[] arr = new int[10000001];
    	int poisonedDuration = 0;
    	
    	for (int i = 0; i < timeSeries.length; i++) {
    		int from = timeSeries[i];
    		int to = timeSeries[i] + duration - 1;
    		
    		for (int j = from; j <= to; j++) {
    			if (arr[j] == 0) {
    				arr[j]++;
    			}
    		}
    	}
    	
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] > 0) {
    			poisonedDuration++;
    		}
    	}
    	return poisonedDuration;
    }
}
