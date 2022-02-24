package algorithm;

import java.util.TreeSet;

public class SecondLargestDigit {
	
	public static void main(String[] args) {
		String s = "dfa12321afd";
		String s2 = "abc1111";
		
		int res = secondHighest(s2);
		System.out.println(res);
	}

    public static int secondHighest(String s) {
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	for (char c : s.toCharArray()) {
    		if (c > 47 && c < 58) {
    			set.add(Integer.parseInt(c  + ""));
    		}
    	}
    	set.pollFirst();
    	Integer result = set.pollFirst();
    	return result == null ? -1 : result;
    }
}
