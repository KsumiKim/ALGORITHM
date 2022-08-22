package algorithm;

public class FinalValue {

	public static void main(String[] args) {
		String[] operations = {"--X","X++","X++"};
		String[] operations2 = {"++X","++X","X++"};
		String[] operations3 = {"X++","++X","--X","X--"};
		
		int res = finalValueAfterOperations(operations3);
		System.out.println(res);
	}
	
    public static int finalValueAfterOperations(String[] operations) {
    	int value = 0;
    	
    	for (String operation : operations) {
    		if (operation.startsWith("+") || operation.endsWith("+")) {
    			value++;
    		} else {
    			value--;
    		}
    	}
    	return value;
    }

}
