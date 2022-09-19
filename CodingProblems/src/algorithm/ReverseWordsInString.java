package algorithm;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String s2 = "God Ding";
		
		String res = reverseWords(s2);
		System.out.println(res);
	}
	
    public static String reverseWords(String s) {
    	StringBuilder sb = new StringBuilder();
    	String[] words = s.split(" ");
    	
    	for (String word : words) {
        	StringBuilder temp = new StringBuilder(word);
    		temp.reverse();
    		sb.append(temp);
    		sb.append(" ");
    	}

    	sb.substring(0, sb.length() - 1);
    	return sb.toString();
    }

}
