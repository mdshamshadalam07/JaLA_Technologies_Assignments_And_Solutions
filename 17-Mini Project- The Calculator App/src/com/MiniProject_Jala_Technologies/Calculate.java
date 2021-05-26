package com.MiniProject_Jala_Technologies;

public class Calculate implements iCalc {

	private char Operator;
	private int iFNum, iSNum;
	private Double dblNumber = new Double(0);
	private Double dblResult = new Double(0);
	private int iResult = 0;
	private boolean typeDouble = false;
	private boolean typelnt = false;

//  constructor calculations
	public Calculate() {

	}

	public Calculate(Double dblNum, char cOperator) {
		dblNumber = dblNum;
		Operator = cOperator;
		typeDouble = true;
	}

	// constructor calculations
	public Calculate(int iFirstNum, char cOperator, int iSecondNum) {
		iFNum = iFirstNum;
		iSNum = iSecondNum;
		Operator = cOperator;
		typelnt = true;
	}

	// Calculates Result
	public void doCalculation() {

		iResult = 0;
		dblResult = 0.0;

		switch (Operator) {

		case '+':
			checkInt();
			iResult = iFNum + iSNum;
			break;

		case '-':
			checkInt();
			iResult = iFNum - iSNum;
			break;

		case '*':
			checkInt();
			iResult = iFNum * iSNum;
			break;

		case '/':
			checkInt();
			if (!checkSecondNum()) {

				iResult = iFNum / iSNum;
			}

		case 'S':
		case 's':

			checkDouble();
			dblResult = Math.sin(dblNumber);
			break;

		case 'C':
		case 'c':

			checkDouble();
			dblResult = Math.cos(dblNumber);
			break;

		case 'T':
		case 't':

			checkDouble();
			dblResult = Math.tan(dblNumber);
			break;

		case 'L':
		case 'l':

			checkDouble();
			dblResult = Math.log(dblNumber);
			break;

		default:
			iResult = 0;
			dblResult = 0.0;

			System.out.println("Operation Not Available. Please select anyof the available options.");
			break;
		}
	}

	// Displays result calculation
	public void getResult() {

		if (typelnt) {

			System.out.println("The result is: " + iResult);
		}

		else if (typeDouble) {
			System.out.println("The result is: " + dblResult);
		}
	}

	// Checks for zero
	public boolean checkSecondNum() {

		if (iSNum == 0) {

			System.out.println("Zero Not allowed");
			System.exit(0);
			return true;
		} else {
			return false;
		}
	}

	public void checkInt() {
		if (!typelnt) {
			iResult = 0;
			System.out.println(" Operation Not Available. Please select any of the available options.");
			System.exit(0);
		}
	}

	public void checkDouble() {
		if (!typeDouble) {
			dblResult = 0.0;
			System.out.println("Operation Not Available. Please select any of the available options.");
			System.exit(0);
		}
	}
}