/*
   16. Write a program to generate NumberFormatException.
   ------------------------------------------------------
 */

package JALA_Technologies_16;

import java.util.Scanner;

public class Test {

	public static void main(String[] arg) {
		int number;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any valid Integer: ");

			try {

				number = Integer.parseInt(sc.next());

				System.out.println("You entered: " + number);
				break;
			} catch (NumberFormatException e) {

				System.out.println("NumberFormatException occured");
			}
		}
	}
}