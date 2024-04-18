package Strings;

public class SumOfDigitsInString {

	public static void main(String [] args) {
		
		String input = "123Hello12";
		int res = findSum(input);
		System.out.println(res);
	}
	
	public static int findSum(String str) {
		
		int sum =0;
		String tempSum= "0";
		
		for(int i =0;i<str.length();i++) {
			char current = str.charAt(i);
			
			if(Character.isDigit(current)) {
				tempSum += current;
			}else {
				sum += Integer.parseInt(tempSum);
				tempSum="0";
			}
		}
		
		return sum+Integer.parseInt(tempSum);
	}
}
