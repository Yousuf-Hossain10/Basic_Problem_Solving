package Recursion;

public class ProductFactorial {

	public static void main(String [] args) {
		int n=5;
		int res = findProduct(n);
		System.out.println(res);
	}
	
	public static int findProduct(int n) {
		 
		if(n<=0) {
			return 1;
		}
		
		return n*findProduct(n-1);
	}
	
	public static int findSum(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+ findSum(n-1);
	}
}
