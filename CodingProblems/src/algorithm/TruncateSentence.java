package algorithm;

public class TruncateSentence {
	
	public static void main(String[] args) {
		String s = "Hello how are you Contestant";
		int k =  4;
		
		String res = truncateSentence(s, k);
		System.out.println(res);
	}

    public static String truncateSentence(String s, int k) {
    	String[] words = s.split(" ");
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < words.length; i++) {
    		if (i == k) {
    			break;
    		}
    		sb.append(words[i]);
    		sb.append(" ");
    	}
    	return sb.toString();
    }

}
