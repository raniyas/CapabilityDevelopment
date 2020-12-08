import java.io.*;
import java.util.*;

public class ArraySort {

	public static void main(String[] args) throws IOException{
		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		int i = 0;
		
		System.out.println("Enter the length of array 1");
		BufferedReader size = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(size.readLine()); 
		
		System.out.println("Enter the first sorted array");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		for (i=0; i<len; i++) {
			sortedArray.add(Integer.parseInt(input.readLine()));
		}
		
		System.out.println("Enter the length of array 2");
		len = Integer.parseInt(size.readLine()); 
		
		System.out.println("Enter the second sorted array");
		for (i=0; i<len; i++) {
			sortedArray.add(Integer.parseInt(input.readLine()));
		}
		
		Collections.sort(sortedArray);
		
		System.out.println(sortedArray);

	}
}
