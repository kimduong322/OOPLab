package exercise.sort;
// Excercise 6.5: SortArray.java

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] iArr = {1789, 2035, 1899, 1456, 2013};
		int iSum = 0;
		
		Arrays.sort(iArr);
		for(int i = 0; i < iArr.length; ++i) {
			iSum += iArr[i];
		}
		
		double dAverage = iSum / iArr.length;
		
		System.out.println("All elements of array: ");
		for(int i = 0; i < iArr.length; ++i) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println("\nSum of all elements: " + iSum
				+ "\nAverage value of array elements: "
				+ dAverage);
	}

}
