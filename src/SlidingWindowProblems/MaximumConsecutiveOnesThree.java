package SlidingWindowProblems;

//We are going to print the indexes of the 0s that can be flipped k times to achieve the max 1s
public class MaximumConsecutiveOnesThree {

	public static void main(String [] args) {
		
		int [] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
		int k=3;
		System.out.println("0s of these indexes need to be flipped");
		findConsecutives(arr,  k);
	}
	
	public static void findConsecutives(int [] arr, int k) {
		
		int start=0;
		int end =0;
		int max=0;
		int count =0;
		
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
		
		for(int i=start;i<Math.min(arr.length, end);i++) {
			if(arr[i]==0) {
				System.out.print(i+" ");
			}
		}
	}
}
