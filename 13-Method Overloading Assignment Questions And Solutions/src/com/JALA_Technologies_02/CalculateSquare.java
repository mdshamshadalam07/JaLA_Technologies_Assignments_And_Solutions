/*
  3. Write two methods with the same name and same number of parameters of same type
     and call from main method.
---------------------------------------------------------------------------------------------- 
*/

package com.JALA_Technologies_02;

public class CalculateSquare {
	
	public void square() {
		
		System.out.println("No Parameter Method Called");
	}

	public int square(int number) {
		
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
		return square;
	}

	public float square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
		return square;
	}

	public static void main(String[] args) {
		CalculateSquare obj = new CalculateSquare();
		obj.square();
		obj.square(5);
		obj.square();
	}
}