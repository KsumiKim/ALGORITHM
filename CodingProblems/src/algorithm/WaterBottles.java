package algorithm;

public class WaterBottles {
	
	public static void main(String[] args) {
		int numBottles = 15, numExchange = 8;
		int res = numWaterBottles2(numBottles, numExchange);
		System.out.println(res);
	}
	
	/*
	 * Given numBottles full water bottles, you can exchange numExchange empty water bottles for one full water bottle.
	 * The operation of drinking a full water bottle turns it into an empty bottle.
	 * Return the maximum number of water bottles you can drink.
	 */
    
    public static int numWaterBottles(int numBottles, int numExchange) {
    	int res = numBottles;
    	
    	while (true) {
    		int quotient = numBottles / numExchange;
    		int modulo = numBottles % numExchange;
    		res += quotient;
    		numBottles = quotient + modulo;
    		
    		if (quotient + modulo < numExchange)
    			break;
    	}
    	return res;
    }
    
    public static int numWaterBottles2(int numBottles, int numExchange) {
        int emptyBottles = 0, fullBottles = numBottles;
        
        while (numBottles >= numExchange) {
        	emptyBottles = numBottles % numExchange;
        	numBottles = numBottles / numExchange;
        	
        	fullBottles += numBottles;
        	numBottles += emptyBottles;
        }
    	return fullBottles;
    }
    
}
