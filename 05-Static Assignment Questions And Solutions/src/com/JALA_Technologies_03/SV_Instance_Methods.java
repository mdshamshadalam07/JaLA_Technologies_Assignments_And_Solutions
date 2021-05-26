
package com.JALA_Technologies_03;

public class SV_Instance_Methods {

	static int a = 10;
	static String str = "Shamshad";

	public void m2() {
		System.out.println("Static_Variables_In_Instance_Methods.m2()");
		System.out.println();
		System.out.println("a : " + a);
		System.out.println("str :" + str);
	}

	public static void main(String[] args) {

		SV_Instance_Methods svim = new SV_Instance_Methods();

		// call instance method
		svim.m2();

	}
}
