package Strings;

import java.util.HashMap;

public class RemoveDuplicateCharacters {

	public static void main(String [] args) {
		
		String str = "zvvvo";
		String res = removeDuplicates(str);
		System.out.println("The result is: "+ res);
	}
	
	public static String removeDuplicates(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] arr = str.toCharArray();
		
		String res = "";
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				
				res = res+arr[i];
				
				map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			}
		}
		
		return res;
	}
}
