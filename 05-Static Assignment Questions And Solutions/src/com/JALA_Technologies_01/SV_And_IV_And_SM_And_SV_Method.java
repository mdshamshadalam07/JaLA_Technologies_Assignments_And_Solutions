/*
   1. Write a class with 2 static variables, 2 , 2 static methods, 
      2 instance methods and a main method.
   ---------------------------------------------------------------------------------
 */

package com.JALA_Technologies_01;

public class SV_And_IV_And_SM_And_SV_Method {

	// 2-Static Variables
	static int rollno = 10;
	static String student_name = "Shamshad";
	static String college = "IIT College";

	// 2-Instance variables
	public String name = "Alam";
	private int age = 25;

	// 2-Static methods
	public static void Method1() {
		System.out.println("Static Method_01");
	}

	public static void Method2() {
		System.out.println("Static Method_02");
	}

	// 2-Instance methods
	public void InstanceMethod1() {

		System.out.println("Instance Method1::");
	}

	public void InstanceMethod2() {

		System.out.println("Instance Method2");
	}

	public static void main(String[] args) {

		System.out.println("Roll No : " + rollno);
		System.out.println("Student Name : " + student_name);
		System.out.println("College Name : " + college);
		System.out.println("------------------");
		System.out.println();

		SV_And_IV_And_SM_And_SV_Method sv = new SV_And_IV_And_SM_And_SV_Method();

		System.out.println(sv.name);
		System.out.println(sv.age);
		System.out.println("------------------");
		System.out.println();

		Method1();
		Method2();
		System.out.println("------------------");
		System.out.println();

		sv.InstanceMethod1();
		sv.InstanceMethod2();
		System.out.println("------------------");

	}
}