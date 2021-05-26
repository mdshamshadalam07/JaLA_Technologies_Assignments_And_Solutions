/*
      4. Write a program to print the odd and even numbers.
	  ----------------------------------------------------------------------------------
*/

package com.JALA_Technologies_04;

public class Odd_Even_Numbers {

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		System.out.println("Odd Numbers:");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);

			}
		}
		System.out.println();
		System.out.println("Even Numbers:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
