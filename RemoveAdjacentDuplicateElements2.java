import java.io.*;
import java.util.*;

public class RemoveAdjacentDuplicateElements2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int k = Integer.parseInt(number.readLine());
		
		// String result = ""; 
	        int count = 0;
	      //  int i = 0;
	    //    Stack<Character> stack = new Stack<Character>();
	        char[] c = s.toCharArray();
	        
	        ArrayList<Character> array = new ArrayList<Character>();
	        
	        for (int i=0; i<c.length; i++){
        		array.add(c[i]);
    	    }
	        int j=0;
	        int i=0;
	    //    for (i=0; i<array.size()-1; i++){
	        while(i<array.size()-1) {
	           // int j = 0;
	        	System.out.println("i = "+array.get(i+1));
	        	System.out.println("j = "+array.get(j));
	        	System.out.println("i = "+i);
	        	System.out.println("j = "+j);
	            if(array.get(j)==array.get(i+1)){ 
	                count++;
	                i++;
	                if(count==(k-1)){
	                	for (int l=j; l<(k+j); l++) {
		                    array.remove(j);
	                    }
	                	i=0;
	                    j=0;
	                    count=0;
	                }
	                else {
	                	i++;
	                	continue;
	                }
	                    
	            }
	            else {
	            	j++;
	            	i++;
	            }
//	            else{
//	                if(count<(k-1) && count!=0){
//	                    stack.push(c[i-1]);
//	                    stack.push(c[i]);
//	                    j++;
//	                    i++;
//	                    count=0;
//	                }
//	                else {
//	                	stack.push(c[i]);
//	                	i++;
//	                	j++;
//	                }
//	                    
//	            }
	        }
	        
//	        Iterator<Character> itr = stack.iterator();
//	        while(itr.hasNext()){
//	            result = result + itr.next().toString();
//	        }
	       
	        System.out.println(array);
	}

}
