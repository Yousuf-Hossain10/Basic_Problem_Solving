package Arrays;

import java.util.Random;

public class ShiftArray {

	public static void main(String [] args) {
		Random randNum = new Random();
		int [] arr = new int [10];

		for(int i=0;i<arr.length;i++) {
			arr[i]= randNum.nextInt(100);
		}	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int rotate = 4;
		shiftArray(rotate, arr);
		System.out.println("The array after rotation by "+rotate+" places");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void shiftArray( int k, int [] arr) {
		int temp [] = new int [k];
		
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}
		
		for(int j=0;j<arr.length-k;j++) {
			arr[j]= arr[j+k];
		}
		
		for(int i=arr.length-k;i<arr.length;i++) {
			arr[i]= temp[i-arr.length+k];
		}
		
		}
	}

