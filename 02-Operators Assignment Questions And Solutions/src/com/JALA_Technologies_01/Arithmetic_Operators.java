/*
       1. Write a function for arithmetic operators(+,-,*,/)
      ---------------------------------------------------------
 */

package com.JALA_Technologies_01;

import java.util.Scanner;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a : ");
		a = sc.nextInt();

		System.out.print("Enter b : ");
		b = sc.nextInt();
		System.out.println();

		/*
		 * 1. Addition(+): -> This operator is a binary operator and is used to add two
		 * operands. Syntax: - a+b Example : - a = 10, b = 20 sum = a + b = 30
		 */
		System.out.println("Addition is : " + (a + b));
		System.out.println();

		/*
		 * 2. Subtraction(-): -> This operator is a binary operator and is used to
		 * subtract two operands. Syntax: - a- b
		 * 
		 * Example: - a = 30, b = 10 sub = a-b = 20
		 */
		System.out.println("Subtraction is : " + (a - b));
		System.out.println();

		/*
		 * 3. Multiplication(*): -> This operator is a binary operator and is used to
		 * multiply two operands. Syntax: - a* b Example: - a = 20, b = 30 mul = a*b =
		 * 600
		 */

		System.out.println("Multiplication is : " + (a * b));
		System.out.println();

		/*
		 * 4. Division(/): This is a binary operator that is used to divide the first
		 * operand(dividend) by the second operand(divisor) and give the quotient as
		 * result. Syntax: - a/ b Example: a = 20, b = 10 div =a / b = 2
		 */
		System.out.println("Division is : " + (a / b));
		System.out.println();
	}

	public static void sum(int a, int b) {
		System.out.println("Addition is : " + (a + b));
	}

	public static void sub(int a, int b) {
		System.out.println("Subtraction is : " + (a - b));
	}

	public static void mul(int a, int b) {
		System.out.println("Multiplication is : " + (a * b));
	}

	public static void div(int a, int b) {
		System.out.println("Division is : " + (a / b));
	}
}
