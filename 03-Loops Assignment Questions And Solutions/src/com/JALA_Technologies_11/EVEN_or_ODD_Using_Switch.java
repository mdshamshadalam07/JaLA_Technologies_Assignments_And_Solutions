/*
      11. Program to check whether a number is EVEN or ODD using switch
   ------------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_11;

import java.util.Scanner;

public class EVEN_or_ODD_Using_Switch {

	public static void main(String args[]) {
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.println(num + " is a EVEN Number");
			break;
		case 1:
			System.out.println(num + " is ODD Number");
		}
	}
}
