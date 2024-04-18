package NumbersAndSeries;

public class FibonacciSeries {

	public static void main(String [] args) {
		
		int num = 10;
		printFibonnaci(num);
	}
	
	public static void printFibonnaci(int num) {
		
		int num1 = 0, num2 = 1;
		 
        int counter = 0;
 
        // Iterate till counter is N
        while (counter < num) {
 
            // Print the number
            System.out.print(num2 + " ");
 
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
		}
	}
}
