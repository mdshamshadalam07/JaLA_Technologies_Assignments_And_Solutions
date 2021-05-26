/*
 3. Use Interface instances to call the implemented method in the implemented class.
 ------------------------------------------------------------------------------------
 */
package com.JALA_Technologies_03;

interface printable {
	
	void print();
}

public class A6 implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}
