/*
   4. Call instance methods in static methods.
   ---------------------------------------------
*/

package com.JALA_Technologies_04;

public class Call_Instance_And_Static_Methods {

	public static void m1() {

		System.out.println("Call_Instance_Methods_In_Static_Methods.m1()");

		Call_Instance_And_Static_Methods obj = new Call_Instance_And_Static_Methods();
		obj.m2();
	}

	public void m2() {
		System.out.println("Call_Static_Methods_Instance_Methods_MainMethod.m2()");
	}

	public static void main(String[] args) {

		// call static method
		m1();
	}
}