import java.util.*;
import java.io.*;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) throws IOException {
	    
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		int flag, i = 0;
		
       	ArrayList<Character> array = new ArrayList<Character>();
       	ArrayList<Character> result = new ArrayList<Character>();
		
        char[] c = s.toCharArray();
		
        for (i=0; i<c.length; i++){
        		array.add(c[i]);
    	}
        
        for (i=0; i<c.length; i++){
        	flag = 0;
        	for (int j=0; j<array.size(); j++){
            	if(c[i]==array.get(j)){
                	flag = flag+1;
            	}
        	}
        	if(flag==1) {
        		result.add(c[i]);
        	}
        }
      		
        System.out.println(result.get(0));
	}
}