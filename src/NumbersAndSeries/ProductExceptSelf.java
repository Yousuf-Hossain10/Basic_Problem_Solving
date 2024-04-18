package NumbersAndSeries;

public class ProductExceptSelf {

	public static void main(String [] args) {
		
		int [] arr = {1,2,3,4};
		findProduct(arr);
	}
	
	public static void findProduct(int [] arr) {
		
		int sum =1;
		for(int i=0;i<arr.length;i++) {
			sum = sum*arr[i];
		}
		
		for(int j=0;j<arr.length;j++) {
			
			arr[j] = sum/arr[j];
			System.out.print(arr[j]+" ");
		}
		
		
	}
}
