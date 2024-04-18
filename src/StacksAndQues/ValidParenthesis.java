package StacksAndQues;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String [] args) {
		String str = "[()[]{}]";
		boolean flag = isValid(str);
		
		if(flag) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not balanced");
		}
	}
	
	 public static boolean isValid(String s) {
		 if(s.length()%2!=0) return false;

	        Stack<Character> stack = new Stack<>();

	        for(int i=0; i<s.length(); i++){
	            if(stack.isEmpty() && (
	                s.charAt(i)==')' || 
	                s.charAt(i)=='}' ||
	                s.charAt(i)==']')){
	                return false;
	            }else{

	                if(!stack.isEmpty()){
	                    if(stack.peek()=='(' && s.charAt(i)==')'){
	                        stack.pop();
	                    }else if (stack.peek()=='{' && s.charAt(i)=='}'){
	                        stack.pop();
	                    }else if(stack.peek()=='[' && s.charAt(i)==']'){
	                        stack.pop();
	                    }else{
	                        stack.add(s.charAt(i));
	                    }
	                }else{
	                    stack.add(s.charAt(i));
	                }
	            }
	        }

	        return stack.isEmpty();
	    }
	}

