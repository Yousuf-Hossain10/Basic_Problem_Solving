package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String [] args) {
		
		int[] arr = {100,200,1,2,3,4,101,5,6,7,2000,2001,2002};
        int ans = checkSequence(arr);
        System.out.println("The longest consecutive sequence is: " + ans);
	}
	
	public static int checkSequence(int [] arr) {
		
		if (arr.length==0) {
			return 0;
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int num:set) {
			if(!set.contains(num-1)) {
				
				int count =1;
				int currentNum = num;
				
				while(set.contains(currentNum+1)) {
					count++;
					currentNum = currentNum+1;
				}
				
				max = Math.max(max, count);
			}
		}
		
		return max;
	}
}
