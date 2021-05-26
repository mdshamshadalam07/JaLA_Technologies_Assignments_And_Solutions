/*
   10. Write a function to find the duplicate values of an array.
   ---------------------------------------------------------------
 */

package com.JALA_Technologies_10;

public class Duplicate_Values_of_Array {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
