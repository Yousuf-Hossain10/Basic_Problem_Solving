package BasicProblemSolving;

public class BitonicPoint {
	
	public static void main(String[]args) {
		
		int arr [] = {1,15,25,45,42,21,17,12,11};
		
		int res = findBitonicPoint(arr);
		
		System.out.println("The pivot point is "+res);
	}
	
	public static int findBitonicPoint(int [] arr) {
		
		int limit = arr.length-1;
		for(int i=0;i<limit;i++) {
			if(arr[i]>arr[i+1]) {
				return arr[i];
			}
		}
		
		return -1;
	}
}
