/*
 8.Create a PUBLIC interface with fields and methods, fields should have values assigned.
 Implement this interface to some class and print the values of the interface fields and
 call the interface methods.
 -------------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_08;

//public interface MyInterface {  // The public type MyInterface must be defined in its own file

interface MyInterface {
    public String hello = "Hello";

    public void sayHello();
}

public class MyInterfaceImpl implements MyInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
    }
}