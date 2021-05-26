/*
    7. Comparing strings using the methods equals().
    ------------------------------------------------
 */

package com.JALA_Technologies_07;

public class Comparing_Methods_Equals {

	public static void main(String args[]) {

		String s1 = "JALATechnologies";
		String s2 = "JALATechnologies";

		String s3 = "JALATECHNOLOGIES";
		String s4 = "Spring";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
