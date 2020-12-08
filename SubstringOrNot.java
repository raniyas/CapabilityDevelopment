import java.io.*;
import java.util.*;

public class SubstringOrNot {

	public static void main(String[] args) throws IOException{
		BufferedReader string1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string 1");
		String s1 = string1.readLine();
		
		BufferedReader string2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string 2");
		String s2 = string2.readLine();
		
		ArrayList<String> array1 = new ArrayList<String>();
		array1 = substring(s1, s1.length());
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2 = substring(s2, s2.length());
		
		boolean isSubtring = array1.contains(s2);
		
		if(isSubtring)
			System.out.println(s2+" is a substring of "+s1);
		else
			System.out.println(s2+" is not a substring of "+s1);
		
		isSubtring = array2.contains(s1);
		
		if(isSubtring)
			System.out.println(s1+" is a substring of "+s2);
		else
			System.out.println(s1+" is not a substring of "+s2);
	}
	
	
	public static ArrayList<String> substring(String str, int n){
		ArrayList<String> array = new ArrayList<String>();
		String substring = "";
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j <= n; j++) {
				substring = str.substring(i, j);  
       		  	array.add(substring);
			}
		} 		
		return array;
    }
}


