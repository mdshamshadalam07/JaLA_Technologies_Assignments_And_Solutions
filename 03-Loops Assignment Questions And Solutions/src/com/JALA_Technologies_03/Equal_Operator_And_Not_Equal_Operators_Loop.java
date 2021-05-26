/*
    03. Program to equal operator and not equal operators .
   ---------------------------------------------------------------------
*/

package com.JALA_Technologies_03;

class Student {
	private int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int var) {
		this.marks = var;
	}

// Overriding Not equals method
	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if (st.getMarks() != this.marks)
			return false;
		return true;
	}
}

public class Equal_Operator_And_Not_Equal_Operators_Loop {
	public static void main(String[] args) {
		Student shams = new Student();
		shams.setMarks(10);

		Student shamshad = new Student();
		shamshad.setMarks(10);

		if (shams.equals(shamshad))
			System.out.println("Marks are same for both students");
		else
			System.out.println("Marks are not same for both students");
	}
}
