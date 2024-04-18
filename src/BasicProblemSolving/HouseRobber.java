package BasicProblemSolving;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String [] args) {
		
		int [] arr = {2,7,9,3,1};
		int res = findMax(arr);
		System.out.println(res);
	}
	
	public static int findMax(int [] arr) {
		
		Arrays.sort(arr);
		
		int res =0;
		for(int i=arr.length-1;i>=1;i=i-2) {
			
			res = res+arr[i];
			
		}
		
		return res;
	}
}
