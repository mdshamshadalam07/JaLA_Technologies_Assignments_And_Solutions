package com.JALA_Technologies_01;

//Sub class B to A
class B extends A {

      //Data Members/Instance variables
	  int y = 30;
	  String s2 = "B Class";
	  
	//2 methods are specific to each class and third method (override method)
	void m1() {
		System.out.println("B m1 method");
	}

	void m4() {
		System.out.println("B m4 method");
	}

	void m5() {
		System.out.println("B m5 method");
	}
}