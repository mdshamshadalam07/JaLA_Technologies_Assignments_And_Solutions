package com.JALA_Technologies_01;

public class Test {
	
	public static void main(String[] args) {
		
		
		A a = new B();
		System.out.println(a.x);
		System.out.println(a.s1);
		System.out.println();
		
		a.m1();
		a.m2();
		a.m3();
		
		
		System.out.println();
		
		B b = new C();
		System.out.println(b.y);
		System.out.println(b.s2);
		System.out.println();
		
		b.m1();
		b.m4();
		b.m5();
		
		System.out.println();
		
		C c = new C();
		System.out.println(c.z);
		System.out.println(c.s3);
		System.out.println();
		
		c.m1();
		c.m6();
		c.m7();
	}
}
