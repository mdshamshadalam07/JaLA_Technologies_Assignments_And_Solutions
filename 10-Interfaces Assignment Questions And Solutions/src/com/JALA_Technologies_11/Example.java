/*
  11. Create an interface with static final variable.
  -------------------------------------------------------
 */

package com.JALA_Technologies_11;

interface Shape {
	
	public static final double pi = 3.14;
	
}
  
 public class Example implements Shape {
	 
	 public static void main(String[] args) {
		  System.out.println(pi);
	}
 }
