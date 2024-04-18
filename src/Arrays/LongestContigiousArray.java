package Arrays;

import java.util.HashMap;

// We are printing the length of the sub array with given sum k
public class LongestContigiousArray {

	public static void main(String [] args) {
		
		int [] arr = {1,2,3,1,1,1,1,4,2,3};
		int target =4;
		int length = findLongestLength(arr,target);
		System.out.println("The length of the longest subarray is: " + length);
		
	}
	
	public static int  findLongestLength(int [] arr, int k ) {
		
		int max =0;
		int sum=0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			
			if(sum==k) {
				max = Math.max(max, i+1);
			}
			
			int rem = sum-k;
			
			if(map.containsKey(rem)) {
				int len = i-map.get(rem);
				max = Math.max(max, len);
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return max;
	}
}
