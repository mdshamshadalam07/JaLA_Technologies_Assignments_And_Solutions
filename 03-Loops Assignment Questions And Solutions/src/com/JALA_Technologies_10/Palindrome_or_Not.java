/*
    10. Write a program to palindrome or not.
	---------------------------------------------------------------
*/

package com.JALA_Technologies_10;

import java.util.Scanner;

public class Palindrome_or_Not {

	public static void main(String args[])  {  

	      String original, reverse = ""; // Objects of String class  
		Scanner in = new Scanner(System.in);   
	      System.out.println(" Enter Check if it is a Palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("It is a Palindrome.");  
	      else  
	         System.out.println("It is Not a Palindrome.");   
	   }  
}