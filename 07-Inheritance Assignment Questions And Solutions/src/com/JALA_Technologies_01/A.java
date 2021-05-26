/*
		A, B and C are classes
		
		A is a super class. B is a sub class of A. C is a sub class of B.
		
		Create three methods in each class, 2 methods are specific to each class and third
		method (override method) should be in all three Classes A, B and C
		
		Create a class with main method. Create an object for each class A, B and C in main
		method and call every method of each class using its own object/instance.
		
		Call an overridden method with super class reference to B and C class’s objects
		
		Runtime Polymorphism with Data Members/Instance variables, Repeat the above
		process only for data members.
-------------------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_01;

//Super class
class A {

	// Data Members/Instance variables
	int x = 10;
	String s1 = "A Class";

	// Three Method
	void m1() {
		System.out.println("A m1 method");
	}

	void m2() {
		System.out.println("A m2 method");
	}

	void m3() {
		System.out.println("A m3 method");
	}
}
