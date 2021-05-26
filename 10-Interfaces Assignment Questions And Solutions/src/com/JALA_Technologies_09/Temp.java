/*
 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario.
 -------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_09;

// private interface TempI { // private methods in interfaces CE: illegal combination of modifiers 
 
//  protected interface TempI  {  protected interface Illegal modifier for the interface TempI.
	
interface TempI { 

 public abstract void method(int n);
}

public class Temp implements TempI {
 @Override
 public void method(int n)
 {
     if (n % 2 == 0)
         System.out.println("shamshad");
     else
         System.out.println("SHAMSHAD");
 }

 public static void main(String[] args)
 {
     TempI in1 = new Temp();
     TempI in2 = new Temp();
     in1.method(4);
     in2.method(3);
 }
}