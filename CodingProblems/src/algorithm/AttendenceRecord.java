package algorithm;

public class AttendenceRecord {
	
	public static void main(String[] args) {
		String s = "PPALLP";
		String s2 = "PPALLL";
		boolean res = checkRecord(s2);
		System.out.println(res);
	}
	
    public static boolean checkRecord(String s) {
    	int absentCnt = 0;
    	boolean isLate = false;
    	int lateCnt = 0;
    	
    	for (char c : s.toCharArray()) {
    		if (c == 'L') {
    			isLate = true;
    			lateCnt++;
    		}

    		if (c == 'A') {
    			absentCnt++;
    		}
    		
    		if (c != 'L' && isLate) {
    			isLate = false;
    			lateCnt = 0;
    		}
    		
    		if (absentCnt == 2 || (isLate && lateCnt == 3)) {
    			return false;
    		}
    	}
    	return true;
    }
}
