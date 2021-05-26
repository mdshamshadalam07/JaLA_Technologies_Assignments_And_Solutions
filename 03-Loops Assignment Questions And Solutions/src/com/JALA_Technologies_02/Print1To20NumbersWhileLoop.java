/*
      2. Write a java program to print 1 to 20 numbers using the while loop.  
*/

package com.JALA_Technologies_02;

public class Print1To20NumbersWhileLoop {

	public static void main(String args[]) {
		// loop counter initialisation
		int i = 1;

		// print statement
		System.out.println("Print  1 to 20 Numbers is : ");

		// loop to print 1 to 20.
		while (i <= 20) {
			System.out.println(" " + i);
			i++;
		}
	}
}
