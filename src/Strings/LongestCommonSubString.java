package Strings;

import java.util.Arrays;

public class LongestCommonSubString {

	public static void main(String [] args) {
		
		String arr [] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println("Here's the result: ");
		findLongestCommonSubStr(arr);
	}
	
	public static void findLongestCommonSubStr(String [] arr) {
		
		String res = "";
		Arrays.sort(arr);
		
		char [] first = arr[0].toCharArray();
		char [] last  = arr [arr.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
	
			if(first[i]==last[i]) {
				res+= first[i];
			}
		}
		
		System.out.println(res);
	}
}
