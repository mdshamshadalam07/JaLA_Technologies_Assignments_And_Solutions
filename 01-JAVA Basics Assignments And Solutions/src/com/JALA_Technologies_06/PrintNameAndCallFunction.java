/*
     6. Write a function to print your name and call the function from main method.
     -------------------------------------------------------------------------------
 */

package com.JALA_Technologies_06;

public class PrintNameAndCallFunction {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		PrintNameAndCallFunction fm = new PrintNameAndCallFunction();
		fm.setName("Md Shamshad Alam");

		String name = fm.getName();
		System.out.println(fm.name);
	}
}
