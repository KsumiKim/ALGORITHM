package algorithm;

public class ViralAdvertisement {

	public static void main(String[] args) {
		int n = 5;
		int n2 = 3;
		
		int res = viralAdvertising(n2);
		System.out.println(res);
	}
	
    public static int viralAdvertising(int n) {
    	int shared = 5, cumulative = 0;
    	
    	for (int i = 0; i < n; i++) {
    		int liked = shared / 2;
    		cumulative += liked;
    		shared = liked * 3;
    	}
    	
    	return cumulative;
    }

}
