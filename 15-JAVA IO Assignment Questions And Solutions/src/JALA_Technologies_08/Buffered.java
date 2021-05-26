/*
      8. Write text to a .txt file using BufferedWriter.
     ---------------------------------------------------------   
 */

package JALA_Technologies_08;

import java.io.*;

public class Buffered {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("D:\\babu.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Shamshad");
		buffer.close();
		System.out.println("Success");
	}
}
