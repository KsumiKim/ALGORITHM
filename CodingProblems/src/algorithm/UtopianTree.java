package algorithm;

public class UtopianTree {

	public static void main(String[] args) {
		int n = 5;
		int n2 = 4;
		
		int res = utopianTree(n2);
		System.out.println(res);
	}
	
    public static int utopianTree(int n) {
    	int height = 1;
    	
    	for (int i = 1; i <= n; i++) {
    		if (i % 2 == 0) {
    			height += 1;
    		} else {
    			height *= 2;
    		}
    	}
    	return height;
    }

}
