package SearchingAndSorting;

public class InsertionSort {

	public static void main(String [] args) {
		
		int arr[] = {2,5,3,65,4,7,5,4,6,6,459,746,5456,85,9,6,896,-8,-58,-6};
		insertionSort(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
	}
	
	public  static void insertionSort(int [] arr) {
		
		for(int i =1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= temp;
		}
	}
}
