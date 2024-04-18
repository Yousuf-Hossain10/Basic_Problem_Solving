package Arrays;

import java.util.Arrays;

public class MinimumSubArrayWithGreaterSum {

	public static void main(String [] args) {
		
		int [] arr = {1, 4, 45, 6, 0, 19};
		int target = 51;
		NaiveSolve(arr, target);
		
		
	}
	
	public static void NaiveSolve(int [] arr, int target) {
		
		int sum=0;
		int size=0;
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			if(target<sum) {
				break;
			}
			
			sum+=arr[i];
			size++;
			
			System.out.print(arr[i] +" ");
		}
		
		 System.out.println(size);
		
	}
	
	public static void OptimalSolve() {
		
	}
}
