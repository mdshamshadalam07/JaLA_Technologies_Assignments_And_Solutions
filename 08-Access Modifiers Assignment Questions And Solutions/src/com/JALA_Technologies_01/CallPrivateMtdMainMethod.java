/*
  1. Create a class with PRIVATE fields, private method and a main method. 
     Print the fields in main method. Call the private method in main method.
     
     Create a sub class and try to access the private fields and methods from sub class.
----------------------------------------------------------------------------------
 */

package com.JALA_Technologies_01;

class subClassCTPMMM {

	// private variable
	private int a = 10;
	private String s = "Java";

	String name = "AAAA";
	int roll = 1233;

	// private method
	private void privateMethod() {
		System.out.println("Private method of Outer Class");
	}

	public static void main(String[] args) {
		subClassCTPMMM sc = new subClassCTPMMM();
		System.out.println(sc.a);
		System.out.println(sc.s);
	}
}

public class CallPrivateMtdMainMethod extends subClassCTPMMM {

	public static void main(String[] args) {

		// call private method
		CallPrivateMtdMainMethod cm = new CallPrivateMtdMainMethod();

		// System.out.println("a : " + cm.a); //its is not call private value for sub class.
		                                                                          

		// System.out.println("s : " + cm.s);// sub class it is not access the private
		                                                     // fields and methods from sub class.
	}
}