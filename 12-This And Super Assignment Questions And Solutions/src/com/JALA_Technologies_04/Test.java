/*
  4. Call argument constructor of current class using this().
  -------------------------------------------------------------
 */

package com.JALA_Technologies_04;

public class Test {
	public Test () {
		System.out.println("0-param");
	}
	public Test(int a) {
		this();
		System.out.println("1-param "+a);
	}
	
	public Test(String name) {
		this(10);
		System.out.println("1-String-param "+name);
	}
	public static void main(String[] args) {
		//new l();
		//new l(500);
		new Test ("ABC");
		
	}
}
