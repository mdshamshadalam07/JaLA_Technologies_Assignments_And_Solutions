/*
  5. Write a program to print largest number among three numbers.
  -------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_05;

import java.util.Scanner;

public class Print_Largest_Number {

	public static void main(String[] args) {

		int counter = 1;
		int number;
		int largest = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		number = sc.nextInt();

		while (counter < 3) {
			System.out.println("Enter the Number : ");
			number = sc.nextInt();
			counter++;

		}

		if (number > 1)
			largest = number;
		System.out.println(".............................");
		System.out.println("The largest number is : " + largest);
		System.out.println();
	}
}