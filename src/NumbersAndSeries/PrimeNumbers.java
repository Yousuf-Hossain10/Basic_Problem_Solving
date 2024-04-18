package NumbersAndSeries;

public class PrimeNumbers {

	public static void main(String [] args) {
		
		int n=15;
		int start=2;
		int end= 50; 
		
		System.out.println("prime numbers within the range "+ n +" are:");
		printPrimes(n);
		
		System.out.println();
		System.out.println("The numbers with the given range"+" "+start+" and"+" "+end);
		
		for(int i =start; i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static void printPrimes(int n) {
		
		for(int i=1;i<=n;i++) {
			int count =0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
	}
	
	 public static boolean isPrime(int num) {
		    if (num == 1)
		      return false;
		    for (int i = 2; i <=Math.sqrt(num); i++) {
		      if (num % i == 0)
		        return false;
		    }
		    return true;
		  }
}
