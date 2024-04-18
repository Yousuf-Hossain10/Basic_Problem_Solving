package NumbersAndSeries;

public class ReverseNumbers {

	public static void main(String [] args) {
		
		int num = 1000;
		int reverse = reverseNumber(num);
		System.out.println(reverse);
	}
	
	public static int reverseNumber(int num) {
		
		int remainder;
		int rev = 0;
		
		while(num>0) {
			remainder = num%10;
			rev = (rev*10)+remainder;
			num = num/10;
		}
		
		return rev;
	}
}
