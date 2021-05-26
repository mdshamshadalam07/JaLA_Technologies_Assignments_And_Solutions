/*
   11. Write a program to generate FileNotFoundException.
   -------------------------------------------------------
 */

package JALA_Technologies_11;

import java.io.*;

public class Example1 {
	public static void main(String[] args) throws IOException {

		// creating object of FileReader
		FileReader reader = new FileReader("file.txt");

		// passing FileReader to
		// buffered reader
		BufferedReader br = new BufferedReader(reader);

		// declaring empty string
		String data = null;

		// while loop to read data
		// and printing them
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}

		// closing the object
		br.close();
	}
}