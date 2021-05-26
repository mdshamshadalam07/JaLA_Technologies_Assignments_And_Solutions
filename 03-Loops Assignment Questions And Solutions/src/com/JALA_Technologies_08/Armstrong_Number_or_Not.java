/*
    8. Write a program to find Armstrong number or not.
	------------------------------------------------------------------------------
*/

package com.JALA_Technologies_08;

import java.util.Scanner;

public class Armstrong_Number_or_Not {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3-digit number: ");
		int num = scan.nextInt();
		boolean result = aNumber(num);
		System.out.println("Answer: " + result);
	}

	public static boolean aNumber(int a) {
		int sum = 0, copy = a, rem;
		boolean flag = false;
		while (copy != 0) {
			rem = copy % 10;
			sum += Math.pow(rem, 3);
			copy = copy / 10;
		}
		if (sum == a)
			flag = true;
		return flag;
	}
}
