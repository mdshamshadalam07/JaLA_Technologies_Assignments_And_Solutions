/*
10. Replacing characters in strings with replace().
---------------------------------------------------
*/

package com.JALA_Technologies_10;

public class Replacing_Characters_Strings_With_Replace {

	public static void main(String args[]) {

		String S1 = new String("JALA Technologies Best Company");
		System.out.println("Original String is ': " + S1);
		System.out.println();

		System.out.println(
				"String after replacing 'Technologies' with 'Company': " + S1.replace("Technologies", "Company"));
		System.out.println();
	}
}
