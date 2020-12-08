import java.io.*;
import java.util.*;

public class DiagonalSort {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> sortedDiagonal = new ArrayList<Integer>();
		int i=0, j=0, k=0;
		
		System.out.println("Enter the number of rows");
		BufferedReader rowSize = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(rowSize.readLine()); 
		
		System.out.println("Enter the number of columns");
		BufferedReader colSize = new BufferedReader(new InputStreamReader(System.in));
		int col = Integer.parseInt(colSize.readLine()); 
		
		int mat[][] = new int[row][col];
		System.out.println("Enter matrix");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				mat[i][j] = Integer.parseInt(input.readLine());
			}
		}
		
		for(j=0; j<col;j++) {
			i=0;
			k=j;
			while(i<row && k<col) {
				System.out.println(i);
				System.out.println(k);
				sortedDiagonal.add(i, mat[i][k]);
				i=i+1;
				k=k+1;
			}
			i=0;
			k=j;
			Collections.sort(sortedDiagonal);
			while(i<row && k<col) {
				mat[i][k] = sortedDiagonal.get(i);
				//sortedDiagonal.remove(i);
				i++;
				k++;
			}
		}
		
//		for(i=1; i<row; i++) {
//			j=0;
//			k=i;
//			while((i-j)==1) {
//				sortedDiagonal.add(j, mat[i][k]);
//				i++;
//				k++;
//			}
//			j=0;
//			k=i;
//			Collections.sort(sortedDiagonal);
//			while(i<row) {
//				mat[i][k] = sortedDiagonal.get(j);
//				i++;
//				k++;
//			}
//		}
		
		for (i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(sortedDiagonal);
		
	}
}
