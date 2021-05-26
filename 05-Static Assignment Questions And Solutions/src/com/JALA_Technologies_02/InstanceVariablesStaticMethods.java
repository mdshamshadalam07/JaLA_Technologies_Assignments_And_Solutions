/*
  2. Print instance variables in static methods.
  -----------------------------------------------
 */

package com.JALA_Technologies_02;

public class InstanceVariablesStaticMethods {

	// Instance_Variables
	public int a = 10;
	String str = "shamshad";

	// static method
	public static void m1() {
		System.out.println("Instance_Variables_In_Static_Methods.m1()");
		System.out.println();

		InstanceVariablesStaticMethods test = new InstanceVariablesStaticMethods();

		System.out.println("a : " + test.a);
		System.out.println("str : " + test.str);
	}

	public static void main(String args[]) {

		// call static method
		m1();
	}
}
