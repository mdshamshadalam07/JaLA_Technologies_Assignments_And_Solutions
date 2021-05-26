/*
   3. Write a program to find the index of an array element.
-------------------------------------------------------------
*/

package com.JALA_Technologies_03;

import java.util.ArrayList;

public class Index_Array_Element {

	public static int findIndex(int arr[], int t) {

		ArrayList<Integer> list = new ArrayList<>();

		// adding elements of array
		for (int i : arr)
			list.add(i);

		return list.indexOf(t);
	}

	public static void main(String[] args) {

		int[] my_array = { 5, 4, 6, 1, 3, 2, 7, 8, 9 };

		System.out.println("Index position of 5 is: " + findIndex(my_array, 5));
		System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
	}
}
