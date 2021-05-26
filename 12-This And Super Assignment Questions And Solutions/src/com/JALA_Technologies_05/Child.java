/*
 5. Call constructor of the parent class using super().
 ---------------------------------------------------------------
 */

package com.JALA_Technologies_05;

class Parent {
	
	Parent()
    {
        System.out.println("Parent class's No " + 
                              " arg constructor");
    }
}
  
public class Child extends Parent {
    Child()
    {
        super();
        System.out.println("Flow comes back from " + 
                        "Parent class no arg const");
    }
    public static void main(String[] args)
    {
        new Child();
        System.out.println("Inside Main");
    }
}