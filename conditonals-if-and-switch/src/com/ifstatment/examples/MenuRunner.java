package com.ifstatment.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		double result = 0.0;
		System.out.print("Enter Number 1:");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		// System.out.printf("The number is %d", number1);

		System.out.print("Enter Number 2:");
		int number2 = scanner.nextInt();

		System.out.println(
				"Choose from following operations \n " + "1: Add \n " + "2: Sub \n " + "3: Multiple \n "
						+ "4: divide ");
		System.out.print("Your respone is :");

		int operationIs = scanner.nextInt();

		// operationUsingIfElse(number1, number2, operationIs);
		operationUsingSwitch(number1, number2, operationIs);

	}

	private static void operationUsingSwitch(int number1, int number2, int operationIs) {
		double result;
		switch (operationIs) {
		case 1:
			result = number1 + number2;
			System.out.println("Result is " + result);
			break; // test

		case 2:
			result = number1 - number2;
			System.out.println("Result is " + result);
			break;

		case 3:
			result = number1 * number2;
			System.out.println("Result is " + result);
			break;

		case 4:
			result = number1 / number2;
			System.out.println("Result is " + result);
			break;

		default:
			System.out.println("Invalid Operation Choice");
		}
	}

}
