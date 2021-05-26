/*
 5. Write two methods with the same name, number of parameters and data type but
    different return Type.
------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_05;

class MethodOverloadingExample
{
  public void show(String s , int i)
 {
   System.out.println(s + " " + i);
 }
  public void show(int i , String s)
 {
   System.out.println(i + " " + s);
 }
}

public class Test
{
  public static void main(String args[])
 {
   MethodOverloadingExample ol = new MethodOverloadingExample();
   ol.show("Be in Present" ,10);
   ol.show(15 , "Alive is Awesome");
 }
} 
