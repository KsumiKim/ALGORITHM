package algorithm;

public class LetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		
		char[] letters2 = {'c', 'f', 'j'};
		char target2 = 'c';
		
		char[] letters3 = {'c', 'f', 'j'};
		char target3 = 'd';
		
		char res = nextGreatestLetter(letters3, target3);
		System.out.println(res);
	}
	
	
    public static char nextGreatestLetter(char[] letters, char target) {
    	
    	for (char word : letters) {
    		if ((int) word > (int)target) {
    			return word;
    		}
    	}
    	
    	return 'z';
    }
}
