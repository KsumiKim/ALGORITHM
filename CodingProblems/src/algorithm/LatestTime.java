package algorithm;

public class LatestTime {

	public static void main(String[] args) {
		String time = "2?:?0";
		String time2 = "0?:3?";
		String time3 = "1?:22";
		String time4 = "??:3?";
		String time5 = "?0:15";
		String time6 = "??:3?";

		String res = maximumTime2(time);
		System.out.println(res);
	}
	
    public static String maximumTime(String time) {
    	StringBuilder sb = new StringBuilder(time);
    	
    	for (int i = 0; i < time.length(); i++) {
    		if (time.charAt(i) != '?')
    			continue;
    		
    		if (i == 0) {
    			if (sb.charAt(i + 1) > '3' && sb.charAt(i + 1) != '?')
        			sb.setCharAt(i, '1');
    			else 
    				sb.setCharAt(i, '2');
    		}
    		
    		if (i == 1) {
    			if (sb.charAt(i - 1) == '2')
    				sb.setCharAt(i, '3');
    			else
    				sb.setCharAt(i, '9');
    		}

    		if (i == 3) 
				sb.setCharAt(i, '5');
    		
    		if (i == 4) 
				sb.setCharAt(i, '9');
    	}
    	return sb.toString();
    }


    
    public static String maximumTime2(String time) {
    	StringBuilder sb = new StringBuilder(time);
    	
    	if (sb.charAt(0) == '?') {
    		
    		if (sb.charAt(1) != '?' && Integer.parseInt(sb.charAt(1) + "") > 3) {
    			sb.setCharAt(0, '1');
    		} else {
    			sb.setCharAt(0, '2');
    		}
    	}
    	
    	if (sb.charAt(1) == '?') {
    		
    		if (sb.charAt(0) == '2') {
    			sb.setCharAt(1, '3');
    		} else {
    			sb.setCharAt(1, '9');
    		}
    	}
    	
    	if (sb.charAt(3) == '?') {
    		sb.setCharAt(3, '5');
    	}
    	
    	if (sb.charAt(4) == '?') {
    		sb.setCharAt(4, '9');
    	}
    	
    	return sb.toString();
    }
}
