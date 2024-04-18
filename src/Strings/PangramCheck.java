package Strings;

public class PangramCheck {

	public static void main(String [] args) {
		
		String str = "We promptly judged antique ivory buckles for the next prize";
		String  res = checkPangram(str);
		System.out.println(res);
	}
	
	public static String checkPangram(String str) {
		
		int [] check = new int [26];
		
		for(int i=0; i<str.length();i++) {
			char current = Character.toUpperCase(str.charAt(i));
			if(Character.isLetter(current)) {
				check[current-'A']++;
			}
		}
		for(int num:check) {
			if(num==0) {
				return "Not Pangram";
			}
		}
		
		return "Is Pangram";
	}
}
