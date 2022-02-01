package algorithm;

public class DetectPattern {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 4, 4, 4};
		int m = 1;
		int k = 3;
		
		int[] arr2 = {1, 2, 1, 2, 1, 1, 1, 3};
		int m2 = 2;
		int k2 = 2;
		
		int[] arr3 = {1, 2, 1, 2, 1, 3};
		int m3 = 2;
		int k3 = 3;
		
		boolean res = containsPattern(arr3, m3, k3);
		System.out.println(res);
	}
	
    public static boolean containsPattern(int[] arr, int m, int k) {
    	
    	for (int i = 0; i < arr.length; i++) {
        	int[] temp = new int[m];
        	
        	if (arr.length - i < m * k) {
        		break;
        	}
        	
        	for (int j = i, cnt = 0; j < arr.length; j++, cnt++) {
        		if (temp[j % m] == 0) {
        			temp[j % m] = arr[j];
        			continue;
        		}
        		
        		if (temp[j % m] != arr[j]) {
        			break;
        		}
        		
        		if (cnt / m >= k) {
        			return true;
        		}
        	}
    	}
    	return false;
    }
}
