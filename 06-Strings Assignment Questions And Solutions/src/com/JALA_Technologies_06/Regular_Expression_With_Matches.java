/*
  6. Matching a String Against a Regular Expression With matches().
  -----------------------------------------------------------------
 */

package com.JALA_Technologies_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression_With_Matches {

public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Shamshad", Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher("Md Shamshad Alam");
		
		boolean matchFound = matcher.find();
		
		if (matchFound) {
			System.out.println("Match found");
		} 
		  
		else {
			System.out.println("Match not found");
		}
	}
}
