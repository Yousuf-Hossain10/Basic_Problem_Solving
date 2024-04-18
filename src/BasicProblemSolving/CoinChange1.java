package BasicProblemSolving;

public class CoinChange1 {

	public static void main(String [] args) {
		
		int arr []= {1,5,6,9,2};
		int target = 6;
		
		int res = coinChange(arr, target);
		System.out.println(res);
	}
	
	public static int coinChange(int [] arr, int target) {
		
		if(target<1) return 0;
		
		int minCoins [] = new int [target+1];
		
		for(int i=1;i<=target;i++) {
			minCoins[i]= Integer.MAX_VALUE;
			
			for(int num : arr) {
				
				if(num<=i && minCoins[i-num]!=Integer.MAX_VALUE) {
					minCoins[i]= Math.min(minCoins[i], 1+minCoins[i-num]);
				}
			}
		}
		
		if(minCoins[target]==Integer.MAX_VALUE) {
			return -1;
		}
		
		return minCoins[target];
	}
}
