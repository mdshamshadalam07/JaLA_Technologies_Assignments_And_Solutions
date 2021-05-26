/*
   8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo().
   -----------------------------------------------------------------
 */

package com.JALA_Technologies_08;

public class EIgnCase_Starts_EndsWith_AndComTo {

	public static void main(String[] args) {

		String str1 = "Compare this String";
		String str2 = "Hello";
		String str3 = "hello";

		// equalsIgnoreCase()
		System.out.println("str1.equals(str2)-" + str1.equals(str2));
		// returns true as case is ignored
		System.out.println("str1.equalsIgnoreCase(str3)-" + str1.equalsIgnoreCase(str3));

		System.out.println();

		// startsWith()
		System.out.println("str.startsWith(\"Compare\"): " + str1.startsWith("Compare"));
		// returns false
		System.out.println("str.startsWith(\"Comparison\"): " + str1.startsWith("Comparison"));
		// returns true- Comparison starts from index 8
		System.out.println("str.startsWith(\"this\"): " + str1.startsWith("this", 8));

		System.out.println();

		// endsWith()
		System.out.println("str.endsWith : " + str1.endsWith("String"));
		System.out.println();

		// compareTo()
		System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
		// returns positive integer
		System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));
		// returns negative integer
		System.out.println("str3.compareTo(str1): " + str3.compareTo(str1));
	}
}
