/*
    12. Print gender (Male/Female) program according to given M/F using switch
	----------------------------------------------------------------------------------------------------------------
*/

package com.JALA_Technologies_12;

import java.util.Scanner;

public class Print_Gender_Male_Female {

	static String gender;
	static String M = "mALe";
	static String F = "FeMaLE";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Gender M for Male and F for Female here : ");
		gender = in.nextLine();

		if (gender.equalsIgnoreCase(M) || gender.equalsIgnoreCase("m")) {
			System.out.println("Male");
		} else if (gender.equalsIgnoreCase(F) || gender.equalsIgnoreCase("f")) {
			System.out.println("Female");
		}
	}
}
