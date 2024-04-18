package SlidingWindowProblems;

//We are going to find the consecutive ones with K possible replacements
public class MaximumConsecutiveOnesTwo {

	public static void main (String [] args) {
		
		int arr [] = {0, 0, 1, 1, 1, 1, 0, 1, 1, 0};
		int k= 2;
		int res=findConsecutives(arr,k);
		System.out.println(res);
		
	}
	
	public static int findConsecutives(int [] arr, int k) {
		
		int start=0;
		int end=0; 
		int max=0;
		int count=0;
		
		while(end<arr.length) {
			if(arr[end]==0) {
				count++;
			}
			if(count>k) {
				if(arr[start]==0) {
					count--;
				}
				start++;
			}
			max= Math.max(max, end-start+1);
			end++;
		}
		return max;
	}
}
