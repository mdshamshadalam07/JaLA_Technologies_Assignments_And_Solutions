/*
   7. Write a program with finally block.
   ----------------------------------------
 */

package JALA_Technologies_07;

public class TestFinallyBlock {
	public static void main(String args[]) {
		try {
			int data = 30 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("Finally rest of the code...");
	}
}
