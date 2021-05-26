
package com.JALA_Technologies_07;

public class Call_SM_And_IM_Main_Method {

	public static void m1() {
		System.out.println("Call_Static_Methods_Instance_Methods_MainMethod.m1()");
	}

	public void m2() {
		System.out.println("Call_Static_Methods_Instance_Methods_MainMethod.m2()");
	}

	public static void main(String[] args) {

		Call_SM_And_IM_Main_Method clm = new Call_SM_And_IM_Main_Method();

		// call static method
		m1();

		// call non-static method
		clm.m2();
	}

}