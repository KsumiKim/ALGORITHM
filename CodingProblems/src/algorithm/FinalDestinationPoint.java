package algorithm;

public class FinalDestinationPoint {
	
	public static void main(String[] args) {
		int n = 5;
		char[] routes = {'R', 'R', 'R', 'U', 'D', 'D'};
		char[] routes2 = {'L', 'R', 'R', 'D', 'U', 'D'};
		
		int[] res = getDestinationPoint(n, routes2);
		System.out.println(res[0] + ", " + res[1]);
	}
	
	public static int[] getDestinationPoint(int n, char[] routes) {
		int row = 0, col = 0;
		
		for (int i = 0; i < routes.length; i++) {
			char route = routes[i];
			
			if (route == 'R' && row < n - 1) {
				row++;
			} else if (route == 'L' && row > 0) {
				row--;
			} else if (route == 'U' && col > 0) {
				col--;
			} else if (route == 'D' && col < n - 1) {
				col++;
			}
		}
		return new int[] {row, col};
	}

}
