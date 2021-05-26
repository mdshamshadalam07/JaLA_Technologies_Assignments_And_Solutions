/*
   4. Define variables for different Data Types int, Boolean, char, float, double and print on the Console.
  -----------------------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_04;

public class DifferentDataTypes {

	// primitive type variables creation
	int i = 10;
	float f = 20;
	char ch = 'a';
    
    // double type variable creation
	double d = 5.0;

	// primitive boolean are creation
	boolean b = true;

	public static void main(String[] args) {

		// user defined class DataTypeDemo variable creation
		DifferentDataTypes dd = new DifferentDataTypes();

		System.out.println("Print Primitive type variables creation int i : " + dd.i);
		System.out.println("Print Primitive type variables creation float f : " + dd.f);
		System.out.println("Print Primitive type variables creation char c : " + dd.ch);
		System.out.println();
		
		System.out.println("Double type variable creation double d : " + dd.d);
		System.out.println();
		
		System.out.println("Primitive boolean are creation boolean b : " + dd.b);
		System.out.println();
		

	}
}
