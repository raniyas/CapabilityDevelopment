import java.io.*;
import java.util.*;

public class RemoveAdjacentDuplicateElements2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		System.out.println("Enter a number");
		int k = Integer.parseInt(input.readLine());
		 
	    int count = 0;
	    char[] c = s.toCharArray();
	        
	    ArrayList<Character> array = new ArrayList<Character>();
	        
	    for (int i=0; i<c.length; i++){
        	array.add(c[i]);
    	}
	    int j=0, i=0;
	   
	    while(i<array.size()-1) {   
	         if(array.get(j)==array.get(i+1)){ 
	                count=count+1;
	                i=i+1;
	                if(count==(k-1)){
	                	for (int l=j; l<(k+j); l++) {
		                    array.remove(j);
	                    }
	                	i=0;
	                    j=0;
	                    count=0;
	                }
	                else
	                	continue;
	            }
	            else {
	            	j++;
	            	i++;
	            }
	   }
	    System.out.println(array);
	}
}
