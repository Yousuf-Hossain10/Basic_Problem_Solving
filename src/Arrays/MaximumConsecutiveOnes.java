package Arrays;

public class MaximumConsecutiveOnes {
	
	public static void main(String [] args) {
		int arr[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findConsec(arr);
        System.out.println("The maximum  consecutive 1's are " + ans);
	}
	
	public static int findConsec(int arr []) {
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1) {
				count=0;
			}else {
				count++;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}
