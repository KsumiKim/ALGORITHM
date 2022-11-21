package algorithm;

public class Exploration {

	public static void main(String[] args) {
		String s = "SOSSOT";
		String s2 = "SOSSPSSQSSOR";
		String s3 = "SOSSOSSOS";
		
		int res = marsExploration(s3);
		System.out.println(res);
	}
	
    public static int marsExploration(String s) {
    	int count = 0;
    	
    	for (int i = 0; i < s.length(); i += 3) {
    		if (s.charAt(i) != 'S') {
    			count++;
    		}

    		if (s.charAt(i + 1) != 'O') {
    			count++;
    		}
    		
    		if (s.charAt(i + 2) != 'S') {
    			count++;
    		}
    	}
    	return count;
    }

}
