package Arrays;

import java.util.Arrays;

public class FindLargestAbsoluteValue {
	
	public static void main (String [] args) {
		
		int [] nums = {-1,4,2,-2,3,-3,0,-8,8,10};
		int res  = findAbsolute(nums);
		System.out.println(res);
	}
	
	public static int findAbsolute(int [] nums) {
		
		int [] arr = new int [nums.length];

		for(int i=0;i<nums.length;i++){
			arr[i]=nums[i];
		}
		
		Arrays.sort(arr);
		
		int low=0;
		int high = arr.length-1;
		
		while(low<high) {
			
			int lowVal = Math.abs(arr[low]);
			int highVal  =  Math.abs(arr[high]);
			
			if(lowVal<highVal){
				high--;
			}else if(lowVal>highVal){
				low++;
			}else{
				return highVal;
			}
		}	
		return -1;
	}
}
