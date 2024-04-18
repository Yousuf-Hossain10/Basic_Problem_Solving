
public class TechnicalInterviewProblems {

	public static void main(String [] args) {
		
		int num = 123456;
		int sum = sumVal(num);
		int rev = revVal(num);
		int well = wellDev1(-12345);
		
		System.out.println(well);
	}
	
	public static int sumVal(int num) {
		
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			num =num/10;
		}
		
		return sum;
	}
	
	public static int revVal(int num) {
		
		int rem =0;
		int rev =0;
		
		while(num>0) {
			rem = num%10;
			rev = rev*10 +rem;
			num = num/10;
		}
		
		return rev;
	}
	
	public static int wellDev1(int num) {
		
		int copy = num;
		int abNum = Math.abs(copy);
		int sum=0;
		int res;
		while(abNum>0) {
			sum=sum+ abNum%10;
			abNum=abNum/10;
		}
		
		if(sum>10) {
			res = (sum%10)+1;
		}else{
			res=sum;
		}
		
		if(copy<0) {
			res = res*-1;
		}
		
		return res;
	}
}
