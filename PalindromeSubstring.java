import java.io.*;
import java.util.Stack;

public class PalindromeSubstring {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		int isPalindrome = 0, count = 0;
		
		Stack<String> stack = new Stack<String>();
		stack = substring(s, s.length());
		
		for(int i = 0; i<stack.size(); i++) {
			isPalindrome = palindrome(stack.get(i));
			if(isPalindrome!=0) {
					count++;
			 }
		}
				
		System.out.println(count);
	}
	
	public static Stack<String> substring(String str, int n)
    {
	   Stack<String> stack = new Stack<String>();
	   String substring = "";
       for (int i = 0; i < n; i++) {
           for (int j = i+1; j <= n; j++) {
	          substring = str.substring(i, j);  
       		  stack.add(substring);
           }
       }     		
       return stack;
    }
	
	public static int palindrome(String substring) {
		      String rev = "";
		      int isPalindrome = 0;
		      
		      for ( int i = substring.length() - 1; i >= 0; i-- )
		         rev = rev + substring.charAt(i);
		 
		      if (substring.equals(rev))
		         isPalindrome++;
		      else
		         isPalindrome = 0;
		      
		      return isPalindrome;
	}

}
