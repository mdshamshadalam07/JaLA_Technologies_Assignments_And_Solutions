/*
     6. Write a program to print even number between 10 and 100 using while.
  ------------------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_06;

import java.util.Scanner;

public class Print_EvenNumber_10_And_100_While {

	public static void main(String[] args) {

		int number, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		number = sc.nextInt();
		i = 10;
		System.out.println("List of Even numbers : ");
		// the while loop executes until the condition become false
		while (i <= number) {
			// prints the even number
			System.out.println(i + " ");
			// increments the variable i by 2
			i = i + 2;
		}
	}
}