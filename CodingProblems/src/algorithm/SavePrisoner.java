package algorithm;

public class SavePrisoner {

	public static void main(String[] args) {
		int n = 4, m = 6, s = 2;
		
		int res = saveThePrisoner(n, m, s);
		System.out.println(res);
	}
	
    public static int saveThePrisoner(int n, int m, int s) {
    	int[] prisoners = new int[n + 1];
    	int position = 0;
    	
    	for (int i = 0; i < m; i++, s++) {
    		position = s % n == 0 ? n : s % n;
    		prisoners[position]++;
		}
    	return position;
    }

}
