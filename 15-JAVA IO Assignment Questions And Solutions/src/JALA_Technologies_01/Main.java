/*
   1. Write a program to read text from .txt file using InputStream.
   ------------------------------------------------------------------
 */

package JALA_Technologies_01;

import java.io.*;

public class Main {
	
	public static String readFile(File file) throws IOException {
		
		StringBuilder sb = new StringBuilder();
		InputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + System.lineSeparator());
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		File file = new File("doc.txt");

		String content = null;
		try {
			content = readFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(content);
	}
}