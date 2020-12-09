import java.io.*;
import java.util.*;

public class DiagonalSort {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> sortedDiagonal = new ArrayList<Integer>();
		int i=0, j=0, k=0;
		
		System.out.println("Enter the number of rows");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row = Integer.parseInt(br.readLine()); 
		
		System.out.println("Enter the number of columns");
		int col = Integer.parseInt(br.readLine()); 
		
		int mat[][] = new int[row][col];
		System.out.println("Enter matrix");
	
		for(i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				mat[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		//To sort upper elements
		for(j=0; j<col;j++) {
			i=0;
			k=j;
			while(i<row && k<col) {
				sortedDiagonal.add(i, mat[i][k]);
				i=i+1;
				k=k+1;
			}
			i=0;
			k=j;
			Collections.sort(sortedDiagonal);
			while(i<row && k<col) {
				mat[i][k] = sortedDiagonal.get(i);
				i++;
				k++;
			}
			sortedDiagonal.clear();
		}
		
		//To sort lower elements
		j=0;
		for(i=1;i<row;i++) {
			k=i;
			j=0;
			while(k<row) {
				sortedDiagonal.add(j, mat[k][j]);
				k=k+1;
				j=j+1;
			}
			k=i;
			j=0;
			Collections.sort(sortedDiagonal);
			while(k<row) {
				mat[k][j] = sortedDiagonal.get(j);
				k=k+1;
				j=j+1;
			}
			sortedDiagonal.clear();
		}
		
		System.out.println("Diagonally Sorted Matrix is: ");
		for (i=0; i<row; i++) {
			for(j=0; j<col; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
