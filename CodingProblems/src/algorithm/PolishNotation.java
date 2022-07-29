package algorithm;

import java.util.Stack;

public class PolishNotation {
	
	public static void main(String[] args) {
		String[] tokens = {"2","1","+","3","*"};
		String[] tokens2 = {"4","13","5","/","+"};
		String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		int res = evalRPN(tokens3);
		System.out.println(res);
	}
	
    public static int evalRPN(String[] tokens) {
    	Stack<Integer> stack = new Stack<>();
    	
    	for (String token : tokens) {
    		char c = token.toCharArray()[0];
    		
    		if (token.length() == 1 && c >= 42 && c <= 47) {
    			int num1 = stack.pop();
    			int num2 = stack.pop();
    			
    			if (token.equals("+")) {
        			stack.push(num1 + num2);
        		} else if (token.equals("-")) {
        			stack.push(num1 - num2);
        		} else if (token.equals("*")) {
        			stack.push(num1 * num2);
        		} else if (token.equals("/")) {
        			stack.push(num2 / num1);
        		} 
    		} else {
    			stack.push(Integer.parseInt(token));
    		}
    	}
    	return stack.pop();
    }

}
