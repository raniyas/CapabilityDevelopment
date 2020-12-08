import java.util.*;
import java.io.*;

public class StringReversalIteration {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		String result = "";
		int i = 0;
		
       	Stack<Character> stack = new Stack<Character>();
       	Stack<Character> reverse = new Stack<Character>();
		
        char[] c = s.toCharArray();
		
        for (i=0; i<c.length; i++){
        		stack.add(c[i]);
    	}
        
        for (i=0; i<c.length; i++){
    		reverse.push(stack.pop());
	    }
        
        Iterator<Character> itr = reverse.iterator();
        while(itr.hasNext()){
            result = result + itr.next().toString();
        }
        
        System.out.println(result);
        
	}

}
