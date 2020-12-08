import java.util.*;
import java.io.*;

public class StringDuplicate {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
        int count = 0;
        ArrayList<Character> array = new ArrayList<Character>();
        
        for (char c: s.toCharArray()) {
        	array.add(c);  
        }
        //System.out.println(array.size());
        for (int i=0; i<array.size(); i++) {
        	count = 0;
        	for (int j=i+1; j<array.size(); j++) {
        		
	        	if(array.get(i) == array.get(j)) {
	        		array.remove(j);
	        		j--;
	        		count++;
	        	}
        	}
        	if(count==0) {
        		array.remove(i);
        		i--;
        	}
        }
        System.out.println(array);
	}
}
