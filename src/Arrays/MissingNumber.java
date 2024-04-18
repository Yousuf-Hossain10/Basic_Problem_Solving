package Arrays;

public class MissingNumber {

	public static void main(String [] args) {
		
		int [] arr = {1,2,3,5};
		int missing;
		int sum1= 5*(5+1)/2;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++) {
			sum2= sum2+arr[i];
		}
		missing = sum1-sum2;
		System.out.println("The missing number is: "+ missing);
	}
}
