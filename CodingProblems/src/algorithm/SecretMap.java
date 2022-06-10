package algorithm;

public class SecretMap {

	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		
		String[] res = solution(n, arr1, arr2);
		
		for (String str : res) {
			System.out.print(str + ", ");
		}
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
        	int combined = arr1[i] | arr2[i];
        	String binary = Integer.toBinaryString(combined);
        	String padded = lpad(n, binary);
        	String decrypted = padded.replaceAll("1", "#").replaceAll("0", " ");
        	answer[i] = decrypted;
        }
        return answer;
    }
    
    
    private static String lpad(int n, String strNumber) {
    	int padCount = n - strNumber.length();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < padCount; i++) {
    		sb.append("0");
    	}
    	return sb.toString() + strNumber;
    }
}
