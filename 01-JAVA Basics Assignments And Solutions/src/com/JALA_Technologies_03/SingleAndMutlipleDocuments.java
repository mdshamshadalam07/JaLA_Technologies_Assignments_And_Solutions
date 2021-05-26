/*
     3. Write a program for a Single line comment, multi-line and documentation comments.
     -------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_03;

/**
 * This is documentation comments this is programs show adding two interger
 * numbers
 * 
 * @author Win10 Date:17/05/2021 version: 1.8s
 */
public class SingleAndMutlipleDocuments {

	/*
	 * Multi-line comments : This is Method two interger numbers and return their
	 * addition result.
	 */

	public int addition(int a, int b) {

		// Single line comment : adding and returing result

		return (a + b);
	}

	public static void main(String[] args) {

		SingleAndMutlipleDocuments add = new SingleAndMutlipleDocuments();
		
		int result = add.addition(10, 20);
		System.out.println("Result : " + result);
	}
}
