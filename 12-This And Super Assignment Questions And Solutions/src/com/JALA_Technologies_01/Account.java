/*
  1. Print the fields/instance members of the current class using this and without using 
     object.
    ----------------------------------------------------------------------------------------
 */
package com.JALA_Technologies_01;

public class Account {
	int a;
	String s;
	public void setData(int a, String s) {
		this.a = a;
		this.s = s;
	}
	public void dataPrint() {
		System.out.println(this.a);
		System.out.println(this.s);
	}
	public static void main(String[] args) {
		/*
		 * Account obj = new Account(); obj.setData(10, 20); System.out.println(obj);
		 */
	    System.out.println(07);
	    System.out.println("Shamshad");
	}
}
