/*
  14. Write a method to find number of even number and odd numbers in an array.
  -------------------------------------------------------------------------------
 */

package com.JALA_Technologies_14;

public class Even_Number_And_Odd_Numbers_Arrays {

	public static void main(String args[]) {

		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Odd Numbers:");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}

		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}