/*
   16. Write a method to verify if the array contains two specified elements(12,23).
   ---------------------------------------------------------------------------------
 */

package com.JALA_Technologies_16;

import java.util.Arrays;

public class Two_Specified_Elements {

	public static void main(String[] args) {

		int[] array_nums = { 12, 12, 23, 23, 23, 12 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));

		int num1 = 12;
		int num2 = 23;

		System.out.println("Result: " + result(array_nums, num1, num2));
	}

	public static boolean result(int[] array_nums, int num1, int num2) {
		for (int number : array_nums) {
			boolean r = number != num1 && number != num2;
			if (r) {
				return false;
			}
		}
		return true;
	}
}