package Arrays;

public class FirstAndLastIndex {

	public static void main(String [] args) {
		
		int arr [] = {1,2,3,4,5,6,1,2,3,4,5,6,3,4,2};
		printFirstLast(arr, 1);
	}
	
	public static void printFirstLast(int arr [], int target) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		
		System.out.println("The first is: "+ min +" The last is: "+max  );
	}
}
