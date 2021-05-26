package com.JALA_Technologies_04;

public class Public_Fields_And_MethodsCheckFieldAndMethodInSamePackage {

	public static void main(String[] args) {
		Public_Fields_And_Methods p = new Public_Fields_And_Methods();
		System.out.println(p.roll);
		System.out.println(p.name);
		System.out.println(p.fee);

		System.out.println("--------------");
		p.publicCheckmethod();
	}
}
