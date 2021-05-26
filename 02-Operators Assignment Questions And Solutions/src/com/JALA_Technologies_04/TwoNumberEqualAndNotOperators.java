/*
     4. Write a program to find the two numbers equal or not.
	  ----------------------------------------------------------------------------------
*/

package com.JALA_Technologies_04;

import java.util.Scanner;

public class TwoNumberEqualAndNotOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two numbers to check for equal and not equal : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		/*
		 * Equal Operators : -> Checks if the values of two operands are equal or not,
		 * if yes then condition becomes true.
		 */

		if (num1 == num2) {
			System.out.println();
			System.out.println("The two numbers are equal");
			System.out.println();
		}

		/*
		 * Not Equal Operators : -> Checks if the values of two operands are equal or
		 * not, if values are not equal then condition becomes true.
		 */

		else if (num1 != num2) {
			System.out.println();
			System.out.println("The numbers are not equal");
			System.out.println();
		}
	}
}
