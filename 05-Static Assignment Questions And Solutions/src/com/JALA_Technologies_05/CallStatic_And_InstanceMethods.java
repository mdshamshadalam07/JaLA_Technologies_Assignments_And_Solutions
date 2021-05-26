
package com.JALA_Technologies_05;

public class CallStatic_And_InstanceMethods {

	public static void m1() {

		System.out.println("Call_Static_Methods_Instance_Methods.m1()");
	}

	public void m2() {

		System.out.println("Call_Static_Methods_Instance_Methods.m2()");
		// call static method
		m1();
	}

	public static void main(String[] args) {

		CallStatic_And_InstanceMethods sm = new CallStatic_And_InstanceMethods();

		// call instance method
		sm.m2();
	}
}