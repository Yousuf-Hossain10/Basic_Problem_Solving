package SlidingWindowProblems;

//We only calculate the consecutive 1s here no strings attached
public class MaximumConsecutiveOnesOne {

	public static void main(String [] args) {
		
		int arr [] ={1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0};
		int max = countConsecutiveOnes(arr);
		
		System.out.println(max);
	}
	
	public static int countConsecutiveOnes(int [] arr) {
		
		int count= 0;
		int max = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i]==0) {
				count =0;
			}else {
				count++;
				max = Math.max(max, count);
				
			}
		}
		
		return max;
	}
}
