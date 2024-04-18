package Arrays;

import java.util.HashMap;

public class SubArrayWithSumZero {

	public static void main(String [] args) {
		int [] arr = {9, -3, 3, -1, 6, -5};
		int max = getLength(arr);
		System.out.println("The sub array with 0 sum has length: "+max);
	}
	
	public static int getLength(int [] arr) {
		
		int sum = 0;
		int max = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
			
			if(sum==0) {
				max = i+1;
			}else {
				if(map.get(sum) !=null) {
					max= Math.max(max, i-map.get(sum));
				}else {
					map.put(sum, i);
				}
			}
		}
		
		return max;
	}
}
