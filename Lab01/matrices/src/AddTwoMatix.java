// Exercise 6.6: AddTwoMatrix.java

import java.util.Scanner;

public class AddTwoMatix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows in the matrix: ");
		int rows = sc.nextInt();
		System.out.println("Enter the columns in the matrix: ");
		int columns = sc.nextInt();
		
		int[][] first = new int [rows][columns];
		int[][] second = new int [rows][columns];
		
		for(int i = 1; i <= rows; ++i) {
			for(int j = 1; j <= columns; ++j) {
				System.out.println(String.format("Enter number first[%d][%d]: ", i-1, j-1));
				first[i-1][j-1] = sc.nextInt();
			}
		}
		
		for(int i = 1; i <= rows; ++i) {
			for(int j = 1; j <= columns; ++j) {
				System.out.println(String.format("Enter number second[%d][%d]: ", i-1, j-1));
				second[i-1][j-1] = sc.nextInt();
			}
		}
		
		System.out.println("\n\nSum of two matrix: ");
		for(int i = 0; i < rows; ++i) {
			for(int j = 0; j < columns; ++j) {
				System.out.print(String.format("%d ", first[i][j] + second[i][j]));
			}
			System.out.print("\n");
		}
		
		sc.close();
		
	}

}
