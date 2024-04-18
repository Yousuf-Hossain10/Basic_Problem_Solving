package Arrays;

import java.util.HashMap;

public class UniqueNumberInSortedArray {

	public static void main(String [] args) {
		
		int arr [] = {1, 1, 2, 2, 3, 3, 4};
		int res = findUnique(arr);
		System.out.println("The unique element is: "+res);
	}
	
	public static int findUnique(int arr []) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==1) {
				return arr[i];
			}
		}
		
		return -1;
	}
}
