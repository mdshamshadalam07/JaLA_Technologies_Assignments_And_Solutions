/*
   4. Extract a string using Substring.
   ------------------------------------
 */

package com.JALA_Technologies_04;

public class String_Using_Substring {

	public static void main(String args[]) {

		String str = new String("Shamshad Is a Java Developer ");

		System.out.println("Substring starting from index 14:");
		System.out.println(str.substring(14));
		System.out.println();

		System.out.println("Substring starting from index 15 and ending at 20:");
		System.out.println(str.substring(15, 20));
	}
}
