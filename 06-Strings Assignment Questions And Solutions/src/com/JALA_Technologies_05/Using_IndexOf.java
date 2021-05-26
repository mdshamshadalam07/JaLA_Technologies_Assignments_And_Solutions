/*
  5. Searching in strings using indexOf().
  ------------------------------------------
 */

package com.JALA_Technologies_05;

public class Using_IndexOf {

	public static void main(String args[]) {

		String s1 = "Java is Very Nice Books ";

		// passing substring
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("Books");
		System.out.println(index1 + "  " + index2);

		// passing substring with from index
		int index3 = s1.indexOf("is", 4);
		System.out.println(index3);

		// passing char value
		int index4 = s1.indexOf('s');
		System.out.println(index4);
	}
}
