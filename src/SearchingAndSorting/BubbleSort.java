package SearchingAndSorting;

public class BubbleSort {

	public static void main(String [] args) {
		
		int arr[] = {2,5,3,65,4,7,5,4,6,6,459,746,5456,85,9,6,896,-8,-58,-6};
		
		bubbleSort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void bubbleSort(int [] arr) {
		
		for(int i =0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}
}
