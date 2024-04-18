package Arrays;

public class RemoveDuplicates {

	public static void main(String [] args) {
		
		int [] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,8,9};
		int k = removeDuplicates(arr);
		for(int i=0; i<k;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int removeDuplicates(int [] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]){
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	} 
}
