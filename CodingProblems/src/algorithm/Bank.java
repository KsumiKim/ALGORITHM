package algorithm;

public class Bank {
	
	public static void main(String[] args) {
		Bank bank = new Bank(new long[] { 10, 100, 20, 50, 30 }) ;
		
		System.out.println( bank.withdraw(3, 10) );
		System.out.println( bank.transfer(5, 1, 20) );
		
		System.out.println( bank.deposit(5, 20) );
		System.out.println( bank.transfer(3, 4, 15) );
		System.out.println( bank.withdraw(10, 50) );
		
	}

	long[] balance; 
	
	public Bank(long[] balance) {
		this.balance = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
    	if (account1 > balance.length || account2 > balance.length) {
    		return false;
    	}

    	boolean result = balance[account1 - 1] - money > 0;
    	
        if (result) {
        	balance[account1 - 1] -= money;
        	balance[account2 - 1] += money;
        }
    	
    	return result;
    }
    
    public boolean deposit(int account, long money) {
    	if (account > balance.length) {
    		return false;
    	}

    	balance[account - 1] += money;
    	return true;
    }
    
    public boolean withdraw(int account, long money) {
    	if (account > balance.length) {
    		return false;
    	}
    	
        long currBalance = balance[account - 1];
        boolean result = currBalance - money > 0;

        if (result) {
            balance[account - 1] = currBalance - money;
        }
    	return result;
    }
}
