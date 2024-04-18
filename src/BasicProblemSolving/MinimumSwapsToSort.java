package BasicProblemSolving;

import java.util.Arrays;

public class MinimumSwapsToSort {

	public static void main(String [] args) {
		
		int [] nums = {10, 19, 6, 3, 5};
		minimumSwaps(nums);
	}
	
	public static void minimumSwaps(int [] arr) {
		
		int [] copy = new int [arr.length];
		int count =0;
		
		for(int i=0;i<copy.length;i++) {
			
			copy[i]=arr[i];
		}
		
		Arrays.sort(copy);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=copy[i]) {
				count++;
			}
		}
		
		System.out.println("The array needs: "+(count/2)+" swaps");
	}
}
