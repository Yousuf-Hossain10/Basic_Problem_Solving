package Recursion;

public class PrintNumbers {

	public static void main(String [] agrs) {
		
		int n =5;
		//printReverse(n);
		printForward(n);
	}
	
	public static void  printReverse(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println(n);
		printReverse(n-1);
	}
	
	public static void printForward(int n) {
		if(n==0) {
			return;
		}
		printForward(n-1);
		System.out.println(n);
	}
}
