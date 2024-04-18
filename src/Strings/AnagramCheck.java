package Strings;

public class AnagramCheck {

	public static void main(String []  args) {
		
		String str1 = "anagram";
		String str2 = "nagaram";
		
		boolean res = checkAnagram(str1,str2);
		
		if(res) {
			System.out.println("The strings are anagrams");
		}else {
			System.out.println("The strings are not anagrams");
		}
	}
	
	public  static boolean checkAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		int [] check = new int [26];
		
		for(int  i=0;i<str1.length();i++) {
			check[str1.charAt(i)-'a']++;
			check[str2.charAt(i)-'a']--;
		}
		
		for(int num:check) {
			if(num!=0) {
				return false;
			}
		}
		
		return true;
	}
}
