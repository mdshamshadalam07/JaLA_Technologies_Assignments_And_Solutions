/*
  3. Create an instance for the child class in child class and call abstract methods.
 ------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_03;

///abstract parent class
abstract class Parent
{
  int number = 10;
  public void display1() //if we declare it as final that it can not be overriden in the Child class
  {
    System.out.println("This is a non-abstract display method of the Parent Class");
  }
  abstract public void display2();
}
//concrete child class
class Child extends Parent
{
  @Override
  public void display1()
  {
    System.out.println("This is a non-abstract display method of the Child Class");
  }
  public void display2()
  {
    System.out.println("This is the implementation of an abstract display method of the Parent Class");
  }
}
public class AbstractClassDemo
{
  public static void main(String args[])
  {
    Parent obj = new Child();
    obj.display1();
    obj.display2();

    //Changing the value of the final variable will produce an error
		obj.number = 15;
	}
}
