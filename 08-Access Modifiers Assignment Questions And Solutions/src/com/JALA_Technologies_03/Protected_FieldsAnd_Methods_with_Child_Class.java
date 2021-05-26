package com.JALA_Technologies_03;


//child class located in a different sub class

public class Protected_FieldsAnd_Methods_with_Child_Class extends Protected_FieldsAnd_Methods{
	
	public static void main(String[] args) {
		
		Protected_FieldsAnd_Methods_with_Child_Class p=new Protected_FieldsAnd_Methods_with_Child_Class();
		
		System.out.println("from sub class::"+p.a);
		p.name();
	}
}
