package NumbersAndSeries;

public class DecimalToBinary {
	
	public static void main(String [] args) {
		
		int decimal = 10;
		String binary =convertToBinary(decimal);
		
		System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
	}
	
	public static String convertToBinary(int dec) {
		
		 int quotient = dec;
		 int remainder; 
	        String binaryNum = "";
	        while (quotient > 0) {
	            remainder = quotient % 2;
	            binaryNum= Integer.toString(remainder) + binaryNum;
	            quotient = quotient / 2;
	        }
	        return binaryNum;
	    }
}
