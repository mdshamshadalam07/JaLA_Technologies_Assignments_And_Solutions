/*
   10. Create an interface with private, public and protected fields.
 ----------------------------------------------------------------------
*/

package com.JALA_Technologies_10;

interface Shape {
	
//	private static final int num = 10;  //  CE: modifier private not allowed here
	
	public static double pi = 3.14;	
	
	// protected static void String s1 ="shamshad"; //  CE: modifier private not allowed here
}
  
 public class Example implements Shape {
	 
	 public static void main(String[] args) {
		  System.out.println(pi);
	}
 }