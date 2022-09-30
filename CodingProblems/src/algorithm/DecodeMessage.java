package algorithm;

public class DecodeMessage {
	
	public static void main(String[] args) {
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		
		String res = decodeMessage(key, message);
		System.out.println(res);
	}

    public static String decodeMessage(String key, String message) {
    	char[] codes = new char[26];
    	
    	String words = key.replaceAll(" ", "");
    	for (int i = 0; i < words.length(); i++) {
    		codes[i] = words.charAt(i);
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (char c : message.toCharArray()) {
    		int idx = 0;
    		for (char code : codes) {
    			idx++;
    			if (code == c) {
    				sb.append((char)(idx + 97));
    			}
    		}
    	}
    	return sb.toString();
    }

}
