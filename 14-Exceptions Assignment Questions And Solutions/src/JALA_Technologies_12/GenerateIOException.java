/*
   12. Write a program to generate IOException.
   --------------------------------------------------
 */

package JALA_Technologies_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class GenerateIOException {
	public static void main(String args[]) throws IOException {
		FileInputStream f = null;
		try {
			f = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		int i;
		// while ((i = f.read()) != -1) { java.lang.Error: Unresolved compilation
		                                   // problems Unhandled exception type IOException

		while ((i = f.read()) != -1) {
			System.out.print((char) i);
		}
		// f.close();
	}
}