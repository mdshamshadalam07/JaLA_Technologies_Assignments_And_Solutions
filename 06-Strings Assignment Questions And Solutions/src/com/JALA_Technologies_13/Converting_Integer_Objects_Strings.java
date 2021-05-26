/*
13. Converting integer objects to Strings.
-------------------------------------------
*/

package com.JALA_Technologies_13;

public class Converting_Integer_Objects_Strings {

	public static void main(String[] args) {

		Integer intObj = new Integer(10);

		// use toString method of Integer class to convert Integer into String.
		String str = intObj.toString();
		System.out.println("Integer converted to String as " + str);
	}
}
