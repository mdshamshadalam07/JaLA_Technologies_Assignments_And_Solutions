package com.JALA_Technologies_03_protecteddiffnt;

import com.JALA_Technologies_03.Protected_FieldsAnd_Methods;

public class InOtherpackageCheckingOfProtectedFieldsANdMethod {
	
	public static void main(String[] args) {
		
		Protected_FieldsAnd_Methods p=new Protected_FieldsAnd_Methods();
		
		// System.out.println(p.a); // It is not Access the PROTECTED fields and methods from any class in different package.
	}
}

