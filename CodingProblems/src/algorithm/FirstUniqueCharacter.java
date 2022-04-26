package algorithm;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String s = "leetcode";
		String s2 = "loveleetcode";
		String s3 = "aabb";
		
		
		int res = firstUniqChar(s);
		System.out.println(res);
	}
	
    public static int firstUniqChar(String s) {
    	
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		
    		if (s.indexOf(c) == i && s.indexOf(c, i + 1) < 0) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
}
