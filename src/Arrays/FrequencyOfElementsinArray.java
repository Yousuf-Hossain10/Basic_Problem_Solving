package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfElementsinArray {

	public static void main(String [] args) {
		
		//only frequency
		int arr [] = {1,1,1,1,12,2,3,3,3,3,4,4,4,4,9,9,9,56,56};
		//countFrequency(arr);
		
		//k frequent elements
		int frequency=2;
		int arr2 [] = findFrequentKElements(frequency, arr);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}
	
	public static void countFrequency(int [] arr) {
		
		HashMap <Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for(Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
	}
	
	public static int [] findFrequentKElements(int k, int [] arr) {
		HashMap <Integer, Integer> map = new HashMap<>();
		int [] res = new int [arr.length/2];
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		int index =0;
		for(int n:map.keySet()) {
			if(map.get(n)>=k) {
				res[index] = n;
				index++;
			}
		}
		
		return res;
	}
}
