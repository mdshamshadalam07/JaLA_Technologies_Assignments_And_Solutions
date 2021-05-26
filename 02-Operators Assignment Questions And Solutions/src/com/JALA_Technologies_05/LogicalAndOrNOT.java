/*
     5. Programs on Logical AND,OR operator and Logical NOT.
	 ----------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_05;

public class LogicalAndOrNOT {

	public static void main(String[] args) {

		// AND(&&) operator
		System.out.println("And Operator");
		System.out.println((5 > 3) && (8 > 5)); // true
		System.out.println((5 > 3) && (8 < 5)); // false
		System.out.println();

		// OR(||) operator
		System.out.println("OR Operator");
		System.out.println((5 < 3) || (8 > 5)); // true
		System.out.println((5 > 3) || (8 < 5)); // true
		System.out.println((5 < 3) || (8 < 5)); // false
		System.out.println();

		// Not (!) operator
		System.out.println("Not Operator");
		System.out.println(!(5 == 3)); // true
		System.out.println(!(5 > 3)); // false
		System.out.println();
	}
}