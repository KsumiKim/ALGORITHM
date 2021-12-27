package algorithm;

public class FlowerBed {

	public static void main(String[] args) {
		int[] flowerbed = {1, 0, 0, 0, 1};
		int[] flowerbed2 = {0, 0, 1, 0, 1}; // 1 
		int[] flowerbed3 = {1, 0, 0, 0, 1, 0, 0};
		int[] flowerbed4 = {0};
		int[] flowerbed5 = {1, 0, 0, 0, 0, 1};
		int[] flowerbed6 = {0, 1, 0};
		
		
		FlowerBed fBed = new FlowerBed();
		boolean result = fBed.canPlaceFlower4(flowerbed4, 1);
		System.out.println(result);
	}
	
	// find if one can place n number of flower on the given flowerbed
	// Note that one cannot place a flower right next to the flower 
	// there at least needs to have an empty space 
		// right next to the flower when placing a new flower 
	public boolean canPlaceFlower(int[] flowerbed, int n) {
		
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 
					&& (i == 0 || flowerbed[i - 1] == 0) 
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i]++;
				n--;
			}
		}
		
		return n == 0;
	}
	
	public boolean canPlaceFlower3(int[] flowerbed, int n) {
		
		if (flowerbed.length == 1) {
			return n == 0 || flowerbed[0] != n; 
		}
		
		if (flowerbed.length == 2) {
			return n == 0 || (flowerbed[0] == 0 && flowerbed[1] == 0 && n == 1); 
		}
		
		// boolean placed = false;
		for (int i = 0; i < flowerbed.length && n > 0; i++) {
		
			if (i == 0) {
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
					flowerbed[i]++;
					n--;
				}
				continue;
			}
			
			if (i == flowerbed.length - 1) {
				if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
					flowerbed[i]++;
					n--;
				}
				continue;
			}
			
			if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
				flowerbed[i]++;
				n--;
			}
		}
		
		return n == 0;
	}


	public boolean canPlaceFlower4(int[] flowerbed, int n) {
		if (flowerbed.length == 1) {
			
			if (flowerbed[0] == 0 && n == 0) {
				return true;
			}
			
			if (flowerbed[0] == 1 && n == 0) {
				return true;
			}
			
			if (flowerbed[0] == 0 && n == 1) {
				return true;
			}
		}
		
		int plotCnt = 0;
		
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				
				if (i == 0 && flowerbed[i + 1] == 0) {
					plotCnt++;
					flowerbed[i] = 1;
					continue;
				}
				
				if (i == flowerbed.length - 1 &&  flowerbed[i - 1] == 0) {
					plotCnt++;
					flowerbed[i] = 1;
					continue;
				}
				
				if (i > 0 && flowerbed[i - 1] == 0 && i < flowerbed.length - 1 && flowerbed[i + 1] == 0) {
					plotCnt++;
					flowerbed[i] = 1;
				}
			}
		}
		
		return plotCnt >= n;
	}
}
