package Strings;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String [] args) {
		
		String str1 = "paper";
		String str2 = "title";
		
		boolean res = checkIsomorph(str1, str2);
		
		if(res) {
			System.out.println("They are isomorphic");
		}else {
			System.out.println("They are not isomorphic");
		}
		
	}
	
	public static boolean checkIsomorph(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		HashMap<Character, Character> map = new HashMap<>();
		
		for(int i=0;i<str1.length();i++) {
			
			char key = str1.charAt(i);
			char value = str2.charAt(i);
			
			if(!map.containsKey(key)) {
				if(!map.containsValue(value)) {
					map.put(key, value);
				}else {
					return false;
				}
			}else {
				char check = map.get(key);
				if(check!=value) {
					return false;
				}
			}
		}
		
		return true;
	}
}
