package Arrays;

public class MoveZerosToEnd {

	public static void main(String [] args) {
		
		int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int[] ans = moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
	}
	
	public static int [] moveZeros(int [] arr) {
		
		int j =-1;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		
		if(j==-1) {
			return arr;
		}
		
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]!=0) {
				int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++; 
			}
		}
		
		return arr;
	}
}
