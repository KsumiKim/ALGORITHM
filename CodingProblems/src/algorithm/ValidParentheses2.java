package algorithm;

import java.util.Stack;

public class ValidParentheses2 {

	public static void main(String[] args) {
		String s = "({[)";
		String s2 = "()[]{}";
		
		boolean res = isValid2(s2);
		System.out.println(res);
	}
	
    public static boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	int i = 0;
    	
    	while (i < s.length()) {
    		char curr = s.charAt(i++);
    		
    		if (!stack.isEmpty()) {
    			
    			if (curr == ')' && stack.peek() == '(') {
    				stack.pop();
    				continue;
    			}
    			if (curr == ']' && stack.peek() == '[') {
    				stack.pop();
    				continue;
    			}
    			if (curr == '}' && stack.peek() == '{') {
    				stack.pop();
    				continue;
    			}
    		}
    		stack.push(curr);
    	}
    	return stack.isEmpty();
    }

    
    public static boolean isValid2(String s) {
    	Stack<Character> stack = new Stack<>();
    	
    	for (int i = 0; i < s.length(); i++) {
    		
    		if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
    			stack.push(s.charAt(i));
    			continue;
    		}
    		
    		while (!stack.isEmpty()) {
    			
    			if (stack.peek() == '(' && s.charAt(i) != ')') {
    				return false;
    			}
    			if (stack.peek() == '{' && s.charAt(i) != '}') {
    				return false;
    			}
    			if (stack.peek() == '[' && s.charAt(i) != ']') {
    				return false;
    			}
    			stack.pop();
    		}
    	}
    	
    	return true;
    }
}
