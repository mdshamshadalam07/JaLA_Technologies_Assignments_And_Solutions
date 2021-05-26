/*
  7. Read text from a .txt file using BufferedReader.
  -----------------------------------------------------
 */

package JALA_Technologies_07;

import java.io.*;

public class Read {
	
	public static void main(String args[]) {
		try {
			File file = new File("shamshad.txt"); 
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr); 
			StringBuffer sb = new StringBuffer(); 
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line); 
				sb.append("\n"); 
			}
			fr.close(); 
			System.out.println("Contents of File: ");
			System.out.println(sb.toString()); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}