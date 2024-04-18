package Arrays;

import java.util.Arrays;

public class ThreeSum {

public static void main(String [] args) {
		
		int arr[] = {0, -1, 2, -3, 1,-4, 1, 5};
		int sum = -2;
		findAllTriplets(arr,sum);
		
	}
	
	public static void findAllTriplets(int [] arr, int sum) {
		
		Arrays.sort(arr);
		
		for(int i =0; i<arr.length-2;i++) {
			int l= i+1;
			int r= arr.length-1;
			int x = arr[i];
			
			while(l<r) {
				if(x+arr[l]+arr[r]==sum) {
					System.out.println("The required triplet is: " + x +" "+ arr[l] +" "+arr[r]);
					l++;
					r--;
				}
				else if(x+arr[l]+arr[r]<sum){
					l++;
				}
				else {
					r--;
				}
			}
		}
	}
}
