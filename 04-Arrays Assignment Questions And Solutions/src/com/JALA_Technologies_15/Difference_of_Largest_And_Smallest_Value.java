/*
15. Write a function to get the difference of largest and smallest value.
--------------------------------------------------------------------------
*/

package com.JALA_Technologies_15;

import java.util.Scanner;

class LargestAndSmallestValue 
{
	//method to get Largest number from array elements
	int getLargest(int[]inputArray)
	{
		int largestValue=inputArray[0];

		for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]>largestValue)
			{
				largestValue=inputArray[i];
			}
		}
		return largestValue;
	}

	//method to get Smallest number from array elements
	int getSmallest(int[]inputArray)
	{
		int smallestValue=inputArray[0];

		for(int i=1;i<inputArray.length;i++)
		{
			if(inputArray[i]<smallestValue)
			{
				smallestValue=inputArray[i];
			}
		}
		return smallestValue;
	}
}

public class Difference_of_Largest_And_Smallest_Value {

	public static void main(String[] args)
	{
		int n;

		// create object of scanner.
		Scanner sc = new Scanner(System.in);

		// you have to enter number here.
		System.out.print("Enter number of elements you wants to enter :" );

		// read entered number and store it in "n".
		n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter ["+(i+1)+"] element :" );
			arr[i]=sc.nextInt();
		}

		LargestAndSmallestValue  mm = new LargestAndSmallestValue();

		// print Largest, Smallest difference of array elements. 
		System.out.println("Largest value is :" +mm.getLargest(arr));
		System.out.println("Smallest value is :" +mm.getSmallest(arr));
		
		int Difference = mm.getLargest(arr)-mm.getSmallest(arr);
		
		System.out.print("Difference between Smallest and Largest in array is : " + Difference );	
	}
}
