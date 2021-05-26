/*
      1. How to create a class, object, method and its signature .
      -------------------------------------------------------------
 */

package com.JALA_Technologies_01;

public class Test {
	
	int x = 5;
	  
 	// create method
	static void Method() {
    System.out.println("I just got executed!");
	}
	
	// Create MethodSignature
	    public int add(int a, int b){
		    int c = a+b;
		    return c;
	    }
        		   
	
	 public static void main(String[] args) 
	 {
		  // Create an Object
		  Test t = new Test();
	      System.out.println(t.x);
	      
	      Method();
	         
	      int result = t.add(56, 34);
	      System.out.println(result);
	 }
}
