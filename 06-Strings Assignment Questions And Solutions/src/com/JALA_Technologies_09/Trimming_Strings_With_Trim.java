/*
9. Trimming strings with trim().
------------------------------------
*/
package com.JALA_Technologies_09;

public class Trimming_Strings_With_Trim {

	public static void main(String args[]) {

		// trims the trailing and leading spaces
		String s = "All java functions to read      ";
		System.out.println(s.trim());

		// trims the leading spaces
		s = " Java loves reading books     ";
		System.out.println(s.trim());

	}
}
