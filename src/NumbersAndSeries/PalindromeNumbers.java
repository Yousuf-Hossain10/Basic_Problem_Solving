package NumbersAndSeries;

public class PalindromeNumbers {

	public static void main(String [] args) {
		
		int start = 10;
		int end = 50;

		for(int i= start; i<=end;i++) {
			if (printPalindromeNumbers(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static boolean printPalindromeNumbers(int num) {
		
		int originalCopy = num;
		int reverse=0;
		int remainder = 0;
		
		while(num>0) {
			remainder = num%10;
			reverse = (reverse*10)  + remainder;
			num=num/10;
		}
		
		if(reverse==originalCopy) {
			return true;
		}
		
		return false;
	}
}
