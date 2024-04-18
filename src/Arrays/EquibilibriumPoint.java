package Arrays;

public class EquibilibriumPoint {

	public static void main(String [] args) {
		
		int arr [] = {1,3,5,2,2};
		int res = findEquilibrium(arr);
		System.out.println("The equilibrium point is: "+res);
		
	}
	
	public static int findEquilibrium(int [] arr) {
		
		if (arr.length==1) {
			return 1;
		}
		
		int right =0;
		int left = 0;
		
		for(int i=0;i<arr.length;i++) {
			right = right + arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(i>0){
				left = left + arr[i-1];
			}
			
			right = right - arr[i];
			
			if(left==right) {
				return i+1;
			}
		}
		
		return -1;
	}
}
