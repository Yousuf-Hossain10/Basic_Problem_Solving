package BasicProblemSolving;

public class ContainerWithMostWater {

	public static void main(String [] args) {
		
		int [] arr = {1,8,6,2,5,4,8,3,7};
		int res = findMaxWater(arr);
		System.out.println("The most water is: "+res);
	}
	
	public static int findMaxWater(int [] arr) {
		
		int left = 0;
		int right = arr.length-1;
		int max = 0;
		
		while(left<=right) {
			
			int area = Math.min(arr[left], arr[right])* (right -left);
			
			max = Math.max(area, max);
			
			if(arr[left]<arr[right]) {
				left++;
			}else {
				right--;
			}
		}
		
		return max;
	}
}
