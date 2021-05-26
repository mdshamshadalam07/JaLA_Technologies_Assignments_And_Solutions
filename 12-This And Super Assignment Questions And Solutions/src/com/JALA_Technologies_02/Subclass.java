/*
 2. Print the fields/instance members of the parent class using super.
 -------------------------------------------------------------------------
 */

package com.JALA_Technologies_02;

//Parent class or Superclass or base class
class Superclass {
	
	int num = 100;
}

//Child class or subclass or derived class
public class Subclass extends Superclass {
	
	 // The same variable num is declared in the Subclass which is already present in the Superclass
	 
	int num = 110;

	void printNumber() {
		System.out.println(num);
		System.out.println(super.num);
	}

	public static void main(String args[]) {
		Subclass obj = new Subclass();
		obj.printNumber();
		
	}
}
