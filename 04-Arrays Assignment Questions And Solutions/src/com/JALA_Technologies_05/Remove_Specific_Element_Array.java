/*
    5. Write a function to remove a specific element from an array.
    -----------------------------------------------------------------
 */

package com.JALA_Technologies_05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Remove_Specific_Element_Array {

	// Function to remove the element
	public static int[] removeTheElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {

			return arr;
		}

		return IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr[i]).toArray();
	}

	public static void main(String[] args) {

		// Get the array
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		// Get the specific index
		int index = 3;

		// Print the index
		System.out.println("Index to be removed: " + index);

		// Remove the element
		arr = removeTheElement(arr, index);

		System.out.println("Resultant Array: " + Arrays.toString(arr));
	}
}
