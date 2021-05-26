/*
      4. Write a function to test if array contains a specific value.
      ----------------------------------------------------------------
 */

package com.JALA_Technologies_04;

public class Array_Contains_Specific_Value {

	public static void main(String[] args) {

	    int[] num = {1, 2, 3, 4, 5};
	    int toFind = 3;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
}
