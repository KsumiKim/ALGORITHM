package algorithm;

public class FlatlandSpace {

	public static void main(String[] args) {
		int n = 6;
		int[] c = {0, 4};
		
		int res = flatlandSpaceStations(n, c);
		System.out.println(res);
	}
	
    public static int flatlandSpaceStations(int n, int[] c) {
    	int maxSpace = 0;
    	
    	for (int i = 0; i < n; i++) {
    		int minDist = Integer.MAX_VALUE, location = 0;
    		
    		for (int j = 0; j < c.length; j++) {
    			if (Math.abs(i - c[j]) < minDist) {
    				minDist = Math.abs(i - c[j]);
    				location = c[j];
    			}
    		}
    		maxSpace = Math.max(maxSpace, Math.abs(location - i));
    	}
    	return maxSpace;
    }

}
