/*
  1. Write two methods with the same name but different number of parameters of same type
     and call the methods from main method.
-------------------------------------------------------------------------------------------------- 
*/

package com.JALA_Technologies_01;

class Add {
	
	void add(int x, int y) {
		int c = x + y;
		System.out.println(c);
	}

	void add(int x, int y, int z) {

		int p = x + y + z;

		System.out.println(p);
	}

	public static void main(String[] argus) {

		Add ad = new Add();

		ad.add(10, 20);

		ad.add(10, 20, 30);
	}
}