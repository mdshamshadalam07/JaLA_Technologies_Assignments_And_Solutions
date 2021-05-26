/*
    3. Apply private, public, protected and default access modifiers 
    to the constructor.
------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_03;

class ABC {
     
	// private
	private void ABC(int a) {
		
		System.out.println("private Constuctor");
		System.out.println(10);
		System.out.println();
		  
	} 

	// public
	public int ABC(int a,int b) {
		
		this.ABC(10);
		System.out.println("public Constuctor");
		System.out.println();
		return a;
	}

	// protected
	protected int ABC(int a, int b, int c) {
		
		System.out.println("protected Constuctor");
		System.out.println();
		return a + b;
	}
	
	int ABC(int a, int b,int c, int d) {
		
		System.out.println("default Constuctor");
		System.out.println();
		return a + b + c+ d;
	}

}

public class Example {
	
	public static void main(String args[]) {
		
		ABC obj = new ABC();
	
		System.out.println(obj.ABC(20,30));
		System.out.println(obj.ABC(40,50,60));
		System.out.println(obj.ABC(70,80,90));
	}
}