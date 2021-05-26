/*
      6. Program for relational operators (<,<==, >, >==).
	  ---------------------------------------------------------------------------
*/

package com.JALA_Technologies_06;

public class RelationalOperators {

	public static void main(String[] args) {

		// create variables
		int a = 7, b = 11;

		// value of a and b
		System.out.println("a is " + a + " and b is " + b);
		System.out.println();

		// == operator
		System.out.println("== Operator");
		System.out.println(a == b); // false
		System.out.println();

		// != operator
		System.out.println("!= Operator");
		System.out.println(a != b); // true
		System.out.println();

		// > operator
		System.out.println("> Operator");
		System.out.println(a > b); // false
		System.out.println();

		// < operator
		System.out.println("< Operator");
		System.out.println(a < b); // true
		System.out.println();

		// >= operator
		System.out.println(">= Operator");
		System.out.println(a >= b); // false
		System.out.println();

		// <= operator
		System.out.println("<= Operator");
		System.out.println(a <= b); // true
		System.out.println();
	}
}