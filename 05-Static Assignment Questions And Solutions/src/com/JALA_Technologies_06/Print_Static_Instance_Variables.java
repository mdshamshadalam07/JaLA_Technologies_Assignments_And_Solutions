/*
  6. Print all the static, instance variables in main method.
  ---------------------------------------------------------------
 */

package com.JALA_Technologies_06;

public class Print_Static_Instance_Variables {

	// static variable
	static int num = 10;
	static String str = "Shamshad";

	// instance variable
	int i = 20;
	String s = "Alam";

	public static void main(String[] args) {

		System.out.println("num : " + num);
		System.out.println("str: " + str);

		System.out.println();

		Print_Static_Instance_Variables sv = new Print_Static_Instance_Variables();

		System.out.println("i : " + sv.i);
		System.out.println("s " + sv.s);
	}
}
