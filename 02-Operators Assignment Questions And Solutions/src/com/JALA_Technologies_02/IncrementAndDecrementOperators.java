/*
         2. Write a method for increment and decrement operators(++, --)
	    ------------------------------------------------------------------
*/

package com.JALA_Technologies_02;

public class IncrementAndDecrementOperators {
	
	public static void main(String[] args) {
		int a, x;

		/*
		 * Increment operators (++) : - 1. First, the value of the variable a
		 * incremented by 1 and store in the memory location of variable a. 2. Second,
		 * the value of variable a assign to the variable x. Example: - x = ++a; a = a+1
		 * x = a
		 */
		
		a = 10;
		x = ++a;

		System.out.println("Increment Variable : a");
		System.out.println("a: " + a);
		System.out.println("x: " + x);
		System.out.println();
		
		/*
		 * Decrement Operators (--) : - 1. First, the value of a decremented by 1 and
		 * store in the memory location of variable a. 2. Second, the value of the
		 * variable a assigned to the variable x. Example : - y = --b; b = b-1 y = b
		 */
		
		int b, y;
		b = 10;
		y = --b;

		System.out.println("Decrement Variable : b");
		System.out.println("b: " + b);
		System.out.println("y: " + y);
		System.out.println();
	}
}