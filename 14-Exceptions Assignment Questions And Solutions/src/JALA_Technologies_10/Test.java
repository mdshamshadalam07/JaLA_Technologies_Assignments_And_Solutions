/*
 10. Write a program to generate ClassNotFoundException.
 ---------------------------------------------------------
 */

package JALA_Technologies_10;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("Shamshad");

			ClassLoader.getSystemClassLoader().loadClass("MyInvisibleClass");

			ClassLoader.getSystemClassLoader().loadClass("MyInvisibleClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}