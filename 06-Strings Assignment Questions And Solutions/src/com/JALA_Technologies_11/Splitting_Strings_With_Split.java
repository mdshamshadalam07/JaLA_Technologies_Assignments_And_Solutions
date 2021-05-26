/*
11. Splitting strings with split().
----------------------------------- -----------
*/

package com.JALA_Technologies_11;

public class Splitting_Strings_With_Split {

	public static void main(String[] args) {

		String strMain = "Shamshad, Sunny, Mumtaj, Salman, Shahbaj";
		String[] arrSplit = strMain.split(", ");
		for (int i = 0; i < arrSplit.length; i++) {
			System.out.println(arrSplit[i]);
		}
	}
}
