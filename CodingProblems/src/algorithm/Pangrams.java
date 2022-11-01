package algorithm;

public class Pangrams {

	public static void main(String[] args) {
		String s = "We promptly judged antique ivory buckles for the next prize";
		String s2 = "We promptly judged antique ivory buckles for the prize";
		boolean res = pangrams(s2);
		
		System.out.println(res);
	}
	
    public static boolean pangrams(String s) {
    	int[] letters = new int[26];
    	boolean isPangram = true;
    	
    	for (char c : s.toCharArray()) {
    		if (c == 32) {
    			continue;
    		}
    		char lowercased = Character.toLowerCase(c);
    		letters[lowercased - 97]++;
    	}
    	
    	for (int n : letters) {
    		if (n == 0) {
    			isPangram = false;
    			break;
    		}
    	}
    	return isPangram;
    }
}
