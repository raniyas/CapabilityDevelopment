import java.io.*;
import java.util.*;

public class AdjacentDuplicates {

	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int k = Integer.parseInt(number.readLine());
		
		 String result = ""; 
		 int count = 0;
	        Stack<Character> stack = new Stack<Character>();
	        char[] c = s.toCharArray();
	        for (int i=0; i<c.length; i++){
	            if(stack.isEmpty()){
	                stack.push(c[i]);
	            }
	            else if(stack.peek()!=c[i]){
	            	if(count<(k-1) && count!=0) {
	            		stack.push(c[i-1]);
	            	}
	                stack.push(c[i]);
	            }
	            else {
	            	count++;
	            	if(count == (k-1)) {
	            		stack.pop();
	            	}
	            	else {
	            		continue;
	            	}
	            }
	                
	        }
	        
	        Iterator<Character> itr = stack.iterator();
	        while(itr.hasNext()){
	            result = result + itr.next().toString();
	        }
	        System.out.println(result);

	}

}
