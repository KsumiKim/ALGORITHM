package algorithm;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "abdhgc";

		String s2 = "abc";
		String t2 = "ahbgdc";

		String s3 = "axc";
		String t3 = "ahbgdc";
		
		String s4 = "";
		String t4 = "ahbgdc";
		
		String s5 = "b";
		String t5 = "abc";
		
		String s6 = "aaaaaa";
		String t6 = "bbaaaa";
		
		String s7 = "ab";
		String t7 = "baab";
		
		System.out.println(isSubsequence2(s7, t7));
	}
	
	// method telling if s is a subsequence of t
	// - the order of subsequence s in t matters
	public static boolean isSubsequence(String s, String t) {
		
		int indexS = 0;
		int indexT = 0;
		
		while (indexT < t.length()) {
			
			if (s.charAt(indexS) == t.charAt(indexT)) {
				
				indexS++;
				
				if (indexS == s.length())
					return true;
			}
			indexT++;
		}
		
		return false;
	}

	public static boolean isSubsequence2(String s, String t) {
		int prevIdx = -1;
		for (char c : s.toCharArray()) {
			int currIdx = t.indexOf(c, prevIdx + 1);
			
			if (t.indexOf(c) < 0 || prevIdx > currIdx) {
				return false;
			}
			prevIdx = currIdx;
		}
		
		return true;
	}
}
