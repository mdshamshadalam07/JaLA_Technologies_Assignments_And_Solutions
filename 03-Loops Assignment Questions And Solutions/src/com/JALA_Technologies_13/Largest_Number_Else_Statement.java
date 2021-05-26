/* 
    13. Program for multiple if else statement(Largest number in 10,20 and 30)
	----------------------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_13;

public class Largest_Number_Else_Statement {
	public static void main(String[] args) {

		int n1 = 10, n2 = 20, n3 = 30;

		if (n1 >= n2) {
			if (n1 >= n3)
				System.out.println(n1 + " is the largest number.");
			else
				System.out.println(n3 + " is the largest number.");
		} else {
			if (n2 >= n3)
				System.out.println(n2 + " is the largest number.");
			else
				System.out.println(n3 + " is the largest number.");
		}
	}
}
