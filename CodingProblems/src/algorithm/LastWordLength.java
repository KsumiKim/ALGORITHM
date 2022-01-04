package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastWordLength {
	
	public static void main(String[] args) {
		String s = "Hello World";
		String s2 = "   fly me   to   the moon  ";
		String s3 = "luffy is still joyboy";
		
		int len = lengthOfLastWord(s3);
		System.out.println(len);
	}
	
    public static int lengthOfLastWord(String s) {
    	String[] strArr = s.split(" ");
    	List<String> wordList = Arrays.stream(strArr).filter(a -> !a.matches("\\s")).collect(Collectors.toList());
    	
    	return wordList.get(wordList.size() - 1).length();
    }
    
    public static int lengthOfLastWord2(String s) {
    	s = s.trim();
    	int len = 0;
    	
    	for (int i = s.length() - 1; i >= 0; i--) {
    		if (s.charAt(i) == ' ') {
    			break;
    		} else {
    			len++;
    		}
    	}
    	
    	return len;
    }
}
