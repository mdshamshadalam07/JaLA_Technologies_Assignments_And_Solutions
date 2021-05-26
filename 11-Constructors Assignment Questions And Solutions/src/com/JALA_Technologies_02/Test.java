 /*
 2. Call the constructors(both default and argument constructors) of 
 super class from a child class.
 ----------------------------------------------------------------------
 */

package com.JALA_Technologies_02;

class Programming {

	// Default Constructor
	public Programming() {
		System.out.println("Programming");
	}
}

// child class
class DP extends Programming {

	public DP() {
		System.out.println("DP");
	}

	// one parameter
	public DP(int i) {
		System.out.println("DP +");
	}
}

public class Test {

	public static void main(String[] args) {

		DP obj = new DP(10);
	}
}