package Arrays;

import java.util.Random;

public class LargestandSmallestElements {

	public static void main(String [] args) {
		
		Random randNum = new Random();
		int [] arr = new int [10];

		for(int i=0;i<arr.length;i++) {
			arr[i]= randNum.nextInt(100);
		}	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		int largest = findLargest(arr);
		int smallest = findSmallest(arr);
		
		System.out.println("The largest element is: "+ largest);
		System.out.println("The smallest element is: "+ smallest);
	}
	
	public static int findLargest(int arr[]) {
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static int findSmallest(int arr[]) {
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
}
