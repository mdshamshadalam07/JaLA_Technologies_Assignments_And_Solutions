/*
 3. Create a class with PROTECTED fields and methods. Access these fields and methods
    from any other class in the same package.
    
    Also, Access the PROTECTED fields and methods from child class located in a different
    package.
    
    Access the PROTECTED fields and methods from any class in different package.
----------------------------------------------------------------------------------------------------------------------------------------
 */

package com.JALA_Technologies_03;

public class Protected_FieldsAnd_Methods {
 
	//PROTECTED fields
	protected int a = 10;
   
	// Access these fields and methods
	protected void name() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Protected_FieldsAnd_Methods a = new Protected_FieldsAnd_Methods();
		System.out.println("main method::" + a.a);
		
		// call  Access these fields and methods
		a.name();
	}
}
