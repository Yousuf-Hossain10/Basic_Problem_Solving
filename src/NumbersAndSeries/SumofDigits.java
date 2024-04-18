package NumbersAndSeries;

public class SumofDigits {

	public static void main(String [] args) {
		
		int num = 12345;
		int sum =sumDigits(num);
		System.out.println("The sum is "+sum);
	}
	
	public static int sumDigits(int num) {
		int sum =0;
		while(num>0) {
			sum= sum+(num%10);
			num=num/10;
		}
		return sum;
	}
}
