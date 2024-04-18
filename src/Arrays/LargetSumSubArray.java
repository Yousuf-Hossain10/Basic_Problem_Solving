package Arrays;

public class LargetSumSubArray {

	public static void main(String [] args) {
		
		int [] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
		int max = findMaxSumWithSubArray(arr);
		System.out.println("The maximum value is: "+max);
	}
	
	public static int findMaxSum(int [] arr) {
		
		int max = Integer.MIN_VALUE;;
		int sum=0;
		
		for(int i=0; i<arr.length;i++) {
			
			sum = sum+arr[i];
			
			if(sum>max) {
				max=sum;
			}
			
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
	
	public static int findMaxSumWithSubArray(int [] arr) {
		
		int max = Integer.MIN_VALUE;
		int sum =0;
		
		int start =0;
		int ansStart= -1;
		int ansEnd= -1;
		
		for(int i=0; i<arr.length;i++) {
			
			if(sum==0) {
				start =i;
			}
			
			sum=sum+arr[i];
			
			if(sum>max) {
				max = sum;
				ansStart = start;
				ansEnd = i;
			}
			
			if(sum<0) {
				sum=0;
			}
			
		}
		
		System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("] ");
		
		
		return max;
	}
}
