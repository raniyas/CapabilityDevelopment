import java.io.*;
import java.util.*;

public class ReverseWords {

	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String s = input.readLine();
		
		String[] words = s.split(" ");
        List<String> array = new ArrayList<String>();
        array = Arrays.asList(words);
        String reverse="", result ="";
        
        for(int i=0; i<array.size(); i++) {
        	reverse = reverse(array.get(i));
        	array.set(i, reverse);
        }
        
        Iterator<String> itr = array.iterator();
        while(itr.hasNext()){
            result = result + itr.next().toString() + " ";
        }
 
        System.out.println(result);
	}
	
	public static String reverse(String word) {
	      String rev = "";
	      
	      for ( int i = word.length() - 1; i >= 0; i-- )
	         rev = rev + word.charAt(i);
	 
	      return rev;
	}
}
