package algorithm;

public class LemonadeChange {

	public static void main(String[] args) {
		int[] input = {5, 5, 10, 10, 20};
		int[] input2 = {10, 10};
		int[] input3 = {5, 5, 10};
		int[] input4 = {5, 5, 5, 10, 20};
		int[] input5 = {5,5,5,20,5,5,5,10,20,5,10,20,5,20,5,10,5,5,5,5};
		int[] input6 = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,20,5,5,5,5,5,5,5,10,5,20,20,5,5,5,5,5,10,5,5,5,20,5,5,5,10,5,5,10,5,20,5,5,20,5,10,5,5,20,5,5,5,5,5,5,10,20,5,20,20,10,5,20,20,5,10,5,5,5,5,5,5,20,20,20,20,5,5,10,5,20,5,5,5,5,10,10,5,5,5,20,5,5,5,5,5,5,20,5,20,10,10,20,5,5,5,5,20,20,5,5,5,5,20,5,20,20,5,5,10,5,5,5,20,5,5,20,5,5,5,5,5,5,5,5,5,5,5,5,20,5,5,10,20,20,5,5,10,20,5,5,5,5,10,20,5,5,10,20,5,10,10,5,5,5,5,5,5,10,10,10,5,10,5,10,5,5,10,10,5,5,5,20,5,20,10,20,5,5,5,20,10,5,5,20,5,5,5,10,5,5,10,5,5,20,5,10,10,5,5,10,5,5,10,5,10,5,20,10,5,10,10,5,5,5,5,10,5,5,5,20,5,5,5,5,10,5,10,10,5,20,20,5,10,10,10,5,10,5,10,5,10,5,5,10,5,5,5,20,5,5,20,5,5,5,5,5,5,10,5,5,20,20,5,5,5,5,10,5,5,5,20,5,5,5,5,10,20,5,5,5,20,20,5,10,5,5,5,10,5,10,20,20,5,5,5,5,5,5,20,10,5,10,5,5,20,10,5,5,5,20,5,5,5,5,5,5,20,5,5,5,5,5,5,5,5,5,5,5,5,5,5,10,10,5,10,5,10,20,10,10,5,5,20,10,20,5,5,5,10,5,5,5,10,5,20,20,20,10,20,5,5,5,5,20,5,20,5,10,5,5,5,5,5,5,20,5,10,5,5,5,20,5,5,5,10,10,5,5,5,5,5,20,20,20,5,5,5,5,20,5,20,5,20,20,10,10,5,5,5};
		int[] input7 = {5,5,5,20,5,5,5,20,5,5,5,10,5,20,10,20,10,20,5,5};

		LemonadeChange lChange = new LemonadeChange();
		boolean res = lChange.lemonadeChange2(input7);
		System.out.println(res);
	}
	
	// only takes $5, $10 or $20 bills 
	public boolean lemonadeChange(int[] bills) {
        int[] changes = new int[3];
		boolean changeable = true;
		
		for (int bill : bills) {
			
			if (bill == 5) {
				changes[0]++;
			} else if (bill == 10) {
				
				if (changes[0] > 0) {
					changes[0]--;
					changes[1]++;
				} else {
					changeable = false;
					break;
				}
			} else if (bill == 20) {
				
				if (changes[0] > 0 && changes[1] > 0) {
					changes[0]--;
					changes[1]--;
					changes[2]++;
				} else if (changes[0] >= 3) {
					changes[0] -= 3;
					changes[2]++;
				} else {
					changeable = false;
					break;
				}
			}
		}
		
    	return changeable;
    }

	
    public boolean lemonadeChange2(int[] bills) {
        int[] changes = new int[3];
        
        for (int bill : bills) {
        	
        	if (bill == 5) {
        		changes[0]++;
        	} else if (bill == 10) {
        		
        		if (changes[0] > 0) {
        			changes[1]++;
        			changes[0]--;
        		} else {
        			return false;
        		}
        	} else if (bill == 20) {
        		
        		if (changes[0] > 0 && changes[1] > 0) {
        			changes[0]--;
        			changes[1]--;
        			changes[2]++;
        		} else if (changes[0] > 2) {
        			changes[0] -= 3;
        			changes[2]++;
        		} else {
        			return false;
        		}
        	}
        }
    	
    	return true;
    }
}
