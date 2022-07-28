package algorithm;

import java.util.Stack;

public class DecodeString {
	
	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		String s2 = "3[a2[c]]";
		String s3 = "2[abc]3[cd]ef";
		
		String result = decodeString(s3);
		System.out.println(result);
	}
    
	public static String decodeString(String s) {
		StringBuilder sb = new StringBuilder();
		StringBuilder numStr = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		boolean isLeft = false;
		
		
		for (char c : s.toCharArray()) {
			if (c == '[') {
				isLeft = true;
			} else if (isLeft && c == ']') {
				int count = Integer.parseInt(numStr.toString());
				String targetString = makeString(stack, count);
				sb.append(targetString);

				isLeft = false;
				numStr.delete(0, numStr.length());
			} else if (isLeft) {
				stack.push(c);
			} else {
				numStr.append(c);
			}
		}
		
    	return sb.toString();
    }
	
	private static String makeString(Stack<Character> stack, int count) {
		StringBuilder sb = new StringBuilder();
		StringBuilder res = new StringBuilder();
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		String reversed = sb.reverse().toString();
		for (int i = 0; i < count; i++) {
			res.append(reversed);
		}
		return res.toString();
	}

}
