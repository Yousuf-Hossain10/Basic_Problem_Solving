package Arrays;

public class ValidAnagram {

	public static void main(String [] args) {
		
		String str1 = "tacocat";
		String str2 = "cacotat";
		
		boolean flag = checkAnagram(str1, str2);
		
		if(flag) {
			System.out.println("The strings are anagrams");
			}else {
				System.out.println("The strings are not anagrams");
			}
	}
	
	public static boolean checkAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char [] store = new char [256];
		
		for(int i =0; i<str1.length();i++) {
			store[str1.charAt(i)- 'a']++;
			store[str2.charAt(i)- 'a']--;
		}
		
		for(int n:store) {
			if(n!=0) {
				return false;
			}
		}
		return true;
	}
}
