package StacksAndQues;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String [] args) {
		String [] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		int res = evaluateRPN(arr);
		System.out.println("The result is: "+res);
	}
	
	public static int evaluateRPN(String [] arr) {
		
		Stack <Integer> stack = new Stack<>();
		for(String token:arr) {
			
			if(token.equals("+")) {
				
				stack.add(stack.pop()+stack.pop());
				
			}else if(token.equals("-")){
				
				int a = stack.pop();
				int b = stack.pop();
				int res = b-a;
				stack.add(res);
				
			}else if(token.equals("*")) {
				
				stack.add(stack.pop()*stack.pop());
				
			}else if(token.equals("/")) {
				
				int a  = stack.pop();
				int b = stack.pop();
				int res = b/a;
				stack.add(res);
			}else {
				
				stack.add(Integer.parseInt(token));
			}
		}
		
		return stack.pop();
	}
}
