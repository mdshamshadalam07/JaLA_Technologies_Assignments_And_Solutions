/*
 2. Create a class with DEFAULT fields and methods. Access these fields and methods
    from any other class in the same package.
    ----------------------------------------------------------------------------------
 */

package com.JALA_Technologies_02;

class A {
	int pid = 1000;
	String pname = "PEN";
	double price = 50.0;

	void method() {
		System.out.println(pid + "   " + pname + "   " + price);
	}
}

public class Default_Fields_And_Methods {

	public static void main(String[] args) {
		A a = new A();
		a.method();
	}
}