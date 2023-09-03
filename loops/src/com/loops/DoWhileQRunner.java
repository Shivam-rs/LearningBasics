package com.loops;

import java.util.Scanner;

public class DoWhileQRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		// System.out.println(9 / 10);
		// TODO Auto-generated method stub
		do {
			System.out.print("Enter a number:");
			number = scanner.nextInt();
			if (number >= 0) {
				System.out.println("Your cube is: " + number * number * number);
			} else {
				System.out.println("Thank you Have Fun");
			}
		} while (number > 0);
	}

}
