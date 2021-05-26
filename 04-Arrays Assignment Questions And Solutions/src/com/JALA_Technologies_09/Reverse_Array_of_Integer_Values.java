/*
9. Write a function to reverse an array of integer values.
-----------------------------------------------------------
*/

package com.JALA_Technologies_09;

public class Reverse_Array_of_Integer_Values {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		// Loop through the array in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}