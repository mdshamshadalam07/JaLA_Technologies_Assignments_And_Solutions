package com.JALA_Technologies_01;
/*
 1. Create an interface with only one method and implement it in a class. Call the method implemented.
 -----------------------------------------------------------------------------------------------------
 */

interface MyInterface {
	
	public void method1();
}

public class Demo implements MyInterface {
	
	public void method1() {
		System.out.println("implementation of method1");
	}

		public static void main(String arg[]) {
		MyInterface obj = new Demo();
		obj.method1();
	}
}