package NumbersAndSeries;

public class BinaryToDecimal {

	public static void main(String [] args) {
		
		String binary = "10101001";
		int bin = 10101001;
		int decimal1 = findDecimal(binary);
		int decimal2 = findDecimal(bin);
		
		System.out.println("The decimal value is: "+decimal1 );
		System.out.println("The decimal value is: "+decimal2 );
	}
	
	//for input given in string format
	public static int findDecimal(String binary) {
		
		int dec = 0;
		int base =1;
		int len = binary.length();
		for(int i=len-1; i>=0;i--) {
			if(binary.charAt(i)=='1') {
				dec= dec+base;
			}
			base = base*2;
		}
		return dec;
	}
	
	//for input given in int format 
	
	public static int findDecimal(int binary) {
		
		int base =1;
		int dec=0;
		int temp = binary;
		
		while(temp>0) {
			
			int last_digit = temp%10;
			temp = temp/10;
			
			dec = dec+base *last_digit;
			base = base*2;
		}
		
		return dec;
	}
}
