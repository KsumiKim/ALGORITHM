package algorithm;

public class DistinctCharacters {
	
	public static void main(String[] args) {
		String s = "xyzzaz";
		String s2 = "aababcabc";
		
		int res = countGoodSubstrings(s2);
		System.out.println(res);
	}
	
	public static int countGoodSubstrings(String s) {
		int count = 0;
		
		for (int i = 0; i < s.length() - 2; i++) {
			String str = s.substring(i, i + 3);
			if (isDistinct(str)) {
				count++;
			}
		}
		
		return count;
    }
	
	private static boolean isDistinct(String str) {
		boolean result = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (str.indexOf(c) != i && str.indexOf(c, i) >= 0) {
				result = false;
			}
		}
		return result;
	}
}
