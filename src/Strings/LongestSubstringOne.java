package Strings;

import java.util.HashSet;

// Here we find the longest substring without any repeating characters
public class LongestSubstringOne {

	public static void main(String [] args) {
		
		String str = "abacdefghabc";
		int maxLength = findMaxSub(str);
		System.out.println(maxLength);
	}
	
	public static int findMaxSub(String str) {
		
		int i =0;
		int j =0;
		int max=0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(j<str.length()) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				max = Math.max(max, set.size());
			}else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return max;
	}
}
