package BasicProblemSolving;

import java.util.Arrays;

public class PeopleAndBoats {

	public static void main(String[]args) {
		
		int [] arr = {3,5,3,4};
		int limit =5;
		
		int res = findBoats(arr,limit);
		System.out.println(res);
	}
	
	public static int findBoats(int [] arr, int limit) {
		
		Arrays.sort(arr);
		
		int boats =0;
		int left =0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			if(arr[left]+arr[right]<=limit) {
				left++;
			}
			
			right--;
			boats++;
		}
		
		return boats;
	}
}
