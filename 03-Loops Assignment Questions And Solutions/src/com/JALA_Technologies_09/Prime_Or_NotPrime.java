/*
    9. Write a program to find the prime or not.
	-----------------------------------------------------------------
*/

package com.JALA_Technologies_09;

import java.util.Scanner;

public class Prime_Or_NotPrime {

	public static void main(String args[])
    {		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter Any Number:");
	//capture the input in an integer
	int num=scan.nextInt();
       scan.close();
	for(int i=2;i<=num/2;i++)
	{
          temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is Not a Prime Number");
  }
}