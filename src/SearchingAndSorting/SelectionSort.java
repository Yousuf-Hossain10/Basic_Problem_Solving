package SearchingAndSorting;

public class SelectionSort {

	public static void main(String [] args) {
		
		int arr[] = {2,5,3,65,4,7,5,4,6,6,459,746,5456,85,9,6,896,-8,-58,-6};
		selectionSort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		
	}
	
	public static void selectionSort(int arr []) {
		
		for(int i =0; i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[min]>arr[j]) {
					min =j;
				}
			}
			
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min]= temp;
		}
	}
}
