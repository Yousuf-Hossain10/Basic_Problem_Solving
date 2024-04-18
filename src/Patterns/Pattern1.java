package Patterns;

public class Pattern1 {

	public static void main(String [] args) {
		
		int lines =5;
		//printRectangle(lines);
		//printTriangleR(lines);
		//printReverseTriangleR(lines);
		//printTriangleL(lines);
		//printReverseTriangleL(lines);
		printPyramid(lines);
		printReversePyramid(lines);
		//printHollowRectangle(lines);
	}
	
	public static void printRectangle(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printTriangleR(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printReverseTriangleR(int n) {
		
		for(int i=n;i>0;i--) {
			
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printTriangleL(int n) {
		
		int spaces = n-1;
		
		for(int i=0;i<n;i++) {	
			
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=i; j>=0;j--) {
				System.out.print("*");
			}
			
			spaces--;
			System.out.println();
			
		}
	}
	
	public static void printReverseTriangleL(int n) {
		
		int spaces =0;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0; j<spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=n; j>i;j--) {
				System.out.print("*");
			}
			
			spaces++;
			System.out.println();
		}
	}
	
	public static void printPyramid(int n) {
		
		for(int i=0; i<n;i++) {
			
			for(int j=0; j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<2*i+1;j++){
				System.out.print("*");
			}
			
			//for(int j=0;j<n-i-1;j++) {
				//System.out.print(" ");
			//}
			System.out.println();
		}
	}
	
	public static void printReversePyramid(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<2*n - (2*i+1);j++) {
				System.out.print("*");
			}
			
			//for(int j=0; j<i;j++){
				//System.out.print(" ");
			//}
			
			System.out.println();
		}
	}
	
	public static void printHollowRectangle(int n) {
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println(" ");
		}
	}
}
