/*
4. Create a class with PUBLIC fields and methods.

 Access the public methods and fields from any class in the same package or 
 different package.
------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_04;

public class Public_Fields_And_Methods {
	
	// PUBLIC fields
	public Integer roll = 1111;
	public String name = "Raja";
	public Double fee = 5000.0;

	// Access the public methods
	public void publicCheckmethod() {
		System.out.println("roll:\t:" + roll);
		System.out.println("name:\t:" + name);
		System.out.println("fee:\t:" + fee);
	}
}
