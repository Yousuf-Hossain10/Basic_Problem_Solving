package NumbersAndSeries;

public class LargestAndSmallestDigits {

	public static void main(String [] args) {
		int input = 18101586;
		findLargestSmallest(input);
	}
	
	public static void findLargestSmallest(int num){
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(num>0) {
			int digit = num%10;
			max = Math.max(max, digit);
			min = Math.min(min, digit);
			num=num/10;
		}
		
		System.out.println("The largest number is "+max);
		System.out.println("The smallest number is "+ min);
		System.out.println("Their sum is "+ (max+min));
	}
}
