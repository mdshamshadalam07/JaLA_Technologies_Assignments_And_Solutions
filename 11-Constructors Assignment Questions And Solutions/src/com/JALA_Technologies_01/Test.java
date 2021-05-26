/*
  1. Write a class with a default constructor, one argument constructor and two argument
     constructors. Instantiate the class to call all the constructors of that class from 
     a main class.
   -------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_01;

//creating a default constructor   
class Bike {

// constructor with one argument
	Bike(String name) {

		System.out.println("Constructor with one " + "argument - String : " + name);
	}

// constructor with two arguments
	Bike(String name, int age) {

		System.out.println("Constructor with two arguments : " + " String and Integer : " + name + " " + age);
	}
}

public class Test {

	// main method
	public static void main(String args[]) {

		// Invoke the constructor with one argument of type 'String'.
		Bike b1 = new Bike("Shamshad");

		// Invoke the constructor with two arguments
		Bike b2 = new Bike("Mumtaj", 26);
	}
}