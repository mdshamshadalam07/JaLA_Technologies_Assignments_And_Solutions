/*
2. Write a function to calculate the average value of an array of integers
----------------------------------------------------------------------------
*/

package com.JALA_Technologies_02;

public class Function_Calculate_Average {

	public static void main(String[] args) {

		int arrNumbers[] = new int[] { 2, 3, 2, 5, 8 };

		int sum = 0;

		for (int a = 0; a < arrNumbers.length; a++) {
			sum = sum + arrNumbers[a];
		}

		Integer average = sum / arrNumbers.length;

		System.out.println("Average is: " + average);

	}
}