package Strings;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfCharacters {

	public static void main(String [] args) {
		
		String str= "Trainee software Engineer Interview";
		System.out.println("The frequencies of characters are");
		showFreq(str);
		//showUniqueFreq(str);
	}
	
	public static void showFreq(String str) {
		
		HashMap <Character, Integer> map = new HashMap<>();
		
		for(int i =0; i<str.length();i++) {
			char current = str.charAt(i);
			if(Character.isLetterOrDigit(current)) {
				map.put(current, map.getOrDefault(current, 0)+1);
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	public static void showUniqueFreq(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char current = str.charAt(i);
			char unique = Character.toUpperCase(current);
			if(Character.isLetterOrDigit(unique)) {
				map.put(unique,  map.getOrDefault(unique, 0)+1);
			}
		}
		for(Entry<Character, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
	}
}
