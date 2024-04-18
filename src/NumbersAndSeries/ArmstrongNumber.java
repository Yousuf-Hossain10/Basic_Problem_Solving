package NumbersAndSeries;

public class ArmstrongNumber {

	public static void main(String [] args) {
		
		int num = 153;
		boolean flag = validateArmstrong(num);
		if (flag) {
			System.out.println("Yes it is an Armstrong number");
		}else {
			System.out.println("No it is not an Armstrong number");
		}
	}
	
	public static boolean validateArmstrong(int num) {
		
		int temp=num;
		int original = num;
		int digits = 0;
		int sum = 0;
		
		while(temp>0) {
			digits++;
			temp=temp/10;
		}
		
		while(num>0) {
			int current = num%10;
			sum += Math.pow(current, digits);
			num=num/10;
		}
		
		return (sum==original);
	}
}
