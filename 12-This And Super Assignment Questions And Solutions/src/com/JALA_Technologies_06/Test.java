 /*
    6. Use this() and super() in methods not in constructors.
    -----------------------------------------------------------
 */

package com.JALA_Technologies_06;

public class Test {
	public static void main(String[] args) {
		new Child();
	}
}

class Parent {
	public Parent() {
		System.out.println("In parent");
	}
}

class Child extends Parent {

	{
		System.out.println("In initializer");
	}

	public Child() {
		super();
		System.out.println("In child");
	}
}