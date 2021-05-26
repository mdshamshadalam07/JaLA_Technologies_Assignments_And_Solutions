/*
1. Write a function to add integer values of an array.
--------------------------------------------------------
*/

package com.JALA_Technologies_01;

import java.util.Arrays;

public class Function_To_Add_Integer {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		int newArr[] = new int[n + 1];
		int value = 7;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		newArr[n] = value;
		System.out.println(Arrays.toString(newArr));
	}
}