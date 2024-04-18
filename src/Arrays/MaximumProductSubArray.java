package Arrays;

public class MaximumProductSubArray {

	public static void main(String [] args) {
		
		int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = findMaxProduct(arr);
        System.out.println("The maximum product subarray is: " + answer);
	}
	
	public static int findMaxProduct(int [] arr) {
		
		int prefix =1;
		int suffix =1;
		int max=1;
		
		for(int i=0; i<arr.length;i++) {
			if (prefix==0) prefix =1;
			if (suffix==0) suffix=1;
			prefix = prefix*arr[i];
			suffix = suffix*arr[arr.length-i-1];
			max = Math.max(max, Math.max(prefix, suffix));
		}
		return max;
	}
}
