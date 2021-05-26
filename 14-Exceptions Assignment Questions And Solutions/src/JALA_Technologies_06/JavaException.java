/*
     6. Write a program to create your own exception.
     ----------------------------------------------------
 */

package JALA_Technologies_06;

public class JavaException {
	public static void main(String args[]) {
		try {
			throw new MyException(2);
			
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}

class MyException extends Exception {
	
	int a;

	MyException(int b) {
		a = b;
	}

	public String toString() {
		return ("Exception Number =  " + a);
	}
}