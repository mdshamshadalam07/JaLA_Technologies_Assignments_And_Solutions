/*
 2. Create a sub class for an abstract class. Create an object in the child class for the
     abstract class and access the non-abstract methods
 ----------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_02;

abstract class Fruit {

	Fruit() {

		System.out.println("Fruit is created");
	}

	void vitamins() {

		System.out.println("Important for good health.");
	}

}

//Creating a Child class which inherits Abstract class

class Orange extends Fruit {
	
}

//Creating a Test class which calls abstract and non-abstract methods

public class TestAbstraction {

	public static void main(String args[]) {

		Fruit obj = new Orange();
		obj.vitamins();
	}
}
