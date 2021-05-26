/*
   4. Write text to a .txt file using BufferedOutputStream.
   ---------------------------------------------------------
 */

package JALA_Technologies_04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedOutputStream bufferedOutput = new BufferedOutputStream
				                            (new FileOutputStream("MyFile.txt"));
		bufferedOutput.write("Line one".getBytes());
		bufferedOutput.write("\n".getBytes());

		bufferedOutput.write(65);
		bufferedOutput.close();
	}
}
