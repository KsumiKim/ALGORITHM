package algorithm;

public class HalloweenSale {
	
	public static void main(String[] args) {
		int p = 20, d = 3, m = 6, s  = 80;
		int p2 = 20, d2 = 3, m2 = 6, s2  = 85;
		
		int res = howManyGames(p2, d2, m2, s2);
		System.out.println(res);
	}

    public static int howManyGames(int p, int d, int m, int s) {
    	int gameCnt = 0, sum = 0;
    	
    	while (sum + p < s) {
    		sum += p;
    		if (p > m) {
        		p -= d;
    		} else {
        		p = m;
    		}
    		gameCnt++;
    	}
    	
    	return gameCnt;
    }
}
