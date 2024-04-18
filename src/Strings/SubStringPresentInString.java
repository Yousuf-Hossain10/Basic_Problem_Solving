package Strings;

public class SubStringPresentInString {

	public static void main(String [] args) {
		
		String text = "I love CocaCola";
		String pattern = "ColaCoca";
		
		int res = findSub(text, pattern);
		
		System.out.println(res);
		
		
	}
	
	public static int findSub(String text, String pattern) {
		
		int N = text.length();
		int M = pattern.length();
		
		for (int i = 0; i < N; i++) {
		      int temp = i;
		      int j = 0;
		      for (j = 0; j < M; j++) {
		        if (text.charAt(temp) != pattern.charAt(j)) {
		          break;
		        }
		        temp++;
		      }
		      if (j == M) {
		        return i;
		      }
		}
		    return -1;
	} 
}
	