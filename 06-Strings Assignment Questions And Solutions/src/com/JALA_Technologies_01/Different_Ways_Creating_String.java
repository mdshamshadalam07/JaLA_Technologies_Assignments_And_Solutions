/*
   1. Different ways creating a string.
   --------------------------------------
 */

package com.JALA_Technologies_01;

public class Different_Ways_Creating_String {

	public static void main(String[] args) {
	     
	// String(String value)
	String s1="Hello!";
	System.out.println("s1 : " + s1);
	System.out.println();
	
	// String copy
	String s2 = new String(s1);
	System.out.println("s2 : " + s2);
	System.out.println();
	
	//creating String with direct String literal
	String s3= new String("Hello!");
	System.out.println("s3 : " + s3);
	System.out.println();
	
	// String (char[] ch)
	char [] ch ={ 'H','e','l','l','o','!',};
	String s4=new String(ch);
	System.out.println("s4 : " + s4);
	System.out.println();
	
	// String(char[] ch,int offset,int count)
	char [] ch1 ={ 'H','e','l','l','o','!',};
	String s5 = new String(ch,2,3);
	System.out.println("s5 : " + s5);
	System.out.println();
	
	// String(btye[] b)
	byte[] b = {97,98,99};
	String s6 = new String(b);
	System.out.println("s6 : " + s6);
	System.out.println();
	
	// String(byte[] b, int offset,int count)
	byte[] b1 = {97,98,99};
	String s7 = new String(b,1,1);
	System.out.println("s7 : " + s7);
	System.out.println();
	
	// String(StringBuffer sb)
	StringBuffer sb1 = new StringBuffer("Hello!");
	System.out.println("sb1 : " + sb1);
	System.out.println();
	
	// String(StringBuffer sb)
	StringBuilder sb2 = new StringBuilder("Hello!");
	System.out.println("sb2 : " + sb2);
	System.out.println();	
   }
}
