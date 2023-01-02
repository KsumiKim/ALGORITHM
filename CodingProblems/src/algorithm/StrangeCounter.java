package algorithm;

public class StrangeCounter {
	
	public static void main(String[] args) {
		long t = 4;
		long res = strangeCounter(t);
		System.out.println(res);
	}

    public static long strangeCounter(long t) {
    	long init = 3, tick = 1, value = 0, num = init;
    	
    	while (true) {
    		tick++;
    		num--;

    		if (tick == t) {
    			value = tick;
    			break;
    		}
    		
    		if (num == 1) {
    			init = num;
    			num *= 2;
    		}
    	}
    	return value;
    }

}
