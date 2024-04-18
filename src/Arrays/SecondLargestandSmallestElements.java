package Arrays;

import java.util.Random;

public class SecondLargestandSmallestElements {

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
		
		int secondLargest = findSecondLargest(arr);
		int secondSmallest = findSecondSmallest(arr);
		
		System.out.println("The second largest element is: "+ secondLargest);
		System.out.println("The second smallest element is: "+ secondSmallest);
	}
	
	public static int findSecondLargest(int [] arr) {
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax= max;		
				max = arr[i];
			}else if(arr[i]>secondMax && secondMax!=max) {
				secondMax= arr[i];
			}
		}
		return secondMax;
	}
	
	public static int findSecondSmallest(int [] arr) {
		int min=arr[0];
		int secondMin= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}else if(arr[i]<secondMin && secondMin!=min){
				secondMin= arr[i];
			}
		}
		return secondMin;
	}
	
	public static void findNumbers() {
		
	}
}
