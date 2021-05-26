/*  
      1. Create an abstract class with abstract and non-abstract methods.
      -----------------------------------------------------------------------
 */

package com.JALA_Technologies_01;

abstract class AbstractDemo { // Abstract class
	
	private int i = 0;

	public void display() { // non-abstract method
		
		System.out.print("Non-abstract method");
	}
}

public class AbstractAndNonAbstractMethods extends AbstractDemo {
	
	public static void main(String args[]) {
		
		AbstractDemo demo = new AbstractAndNonAbstractMethods();
		demo.display();
	}
}