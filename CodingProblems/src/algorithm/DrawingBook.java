package algorithm;

public class DrawingBook {
	
	public static void main(String[] args) {
		int n = 5, p = 3;
		
		int res = pageCount(n, p);
		System.out.println(res);
	}

    public static int pageCount(int n, int p) {
    	int[] pages = new int[n + 1];
    	int countFromForward = Integer.MAX_VALUE, countFromBackward = Integer.MAX_VALUE;
    	
    	for (int i = 1; i < n + 1; i++) {
    		pages[i] = i;
    	}
    	
    	for (int i = 0, j = 1; i < pages.length; i+=2, j++) {
    		if (pages[i] == p || pages[i + 1] == p) {
    			countFromForward = j++;
    			countFromBackward = (pages.length / 2) - j;
    		}
    	}
    	return Math.min(countFromForward, countFromBackward);
    }

}
