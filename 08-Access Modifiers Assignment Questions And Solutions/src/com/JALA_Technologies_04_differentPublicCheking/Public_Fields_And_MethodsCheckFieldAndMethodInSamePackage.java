package com.JALA_Technologies_04_differentPublicCheking;

import com.JALA_Technologies_04.Public_Fields_And_Methods;

//Access the public methods and fields from different package.

public class Public_Fields_And_MethodsCheckFieldAndMethodInSamePackage {

	public static void main(String[] args) {
		
		Public_Fields_And_Methods p=new Public_Fields_And_Methods();
		System.out.println(p.roll);
		System.out.println(p.name);
		System.out.println(p.fee);
		
		System.out.println("--------------");
		
		System.out.println("Different Public Checking");
		System.out.println();
		p.publicCheckmethod();
	}
}
