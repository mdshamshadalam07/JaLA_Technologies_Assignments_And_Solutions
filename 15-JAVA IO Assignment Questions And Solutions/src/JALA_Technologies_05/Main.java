/*
 5. Write a program to read text from .txt file using FileReader.
 ------------------------------------------------------------------
 */

package JALA_Technologies_05;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file = new File("doc.txt");

		try (FileReader fr = new FileReader(file)) {
			int content;
			while ((content = fr.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}