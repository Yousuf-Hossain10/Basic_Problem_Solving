package Arrays;

import java.util.HashMap;

// We are gonna look at two variants of the same 2sum problem one returns the indexes other returns yes or no
public class TwoSum {

	public static void main (String [] args){
		
		int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        boolean flag=findPairs(arr, target);
        if(flag) {
        	System.out.println("Yes there exists a pair!");
        }else {
        	System.out.println("No pairs found!");
        }
        int [] res = findIndexes( arr, target);
        System.out.println( "The indexes are "+res[0] +" "+ res[1]); 
	}
	
	public static int [] findIndexes(int [] arr, int target) {
		
		int [] res = {-1,1};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length;i++) {
			
			int diff = target - arr[i];
			
			if(map.containsKey(diff)) {
				res[0]= i;
				res[1]= map.get(diff);
			}else {
				map.put(arr[i], i);
			}
		}
		
		return res;
	}
	
	public static boolean findPairs(int [] arr, int target) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			int diff= target - arr[i];
			
			if(map.containsKey(diff)) {
				return true;	
			}else {
				map.put(arr[i], i);
			}
		}
		return false;
	}
}
