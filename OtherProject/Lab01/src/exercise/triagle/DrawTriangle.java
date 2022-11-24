package exercise.triagle;
// Exercise 6.3: DrawTriangle.java
// Display triangle with height = n entered by user
//    *    
//   ***   
//  *****  
// ******* 
//********* 

import java.util.Scanner;

public class DrawTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char CMULTI = '*', CSPACE = ' ';
		
		System.out.println("Input, n = ");
		int n = sc.nextInt();
		
		for(int i = n; i > 0; --i) {
			for(int j = 0; j < i-1; ++j) {
				System.out.print(CSPACE);
			}
			for(int k = 0; k < n - i; ++k) {
				System.out.print(CMULTI);
			}
			System.out.print(CMULTI);
			for(int k = 0; k < n - i; ++k) {
				System.out.print(CMULTI);
			}
			for(int j = 0; j < i-1; ++j) {
				System.out.print(CSPACE);
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
