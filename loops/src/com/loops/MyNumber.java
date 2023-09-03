package com.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// TODO Auto-generated method stub
		if (number < 2) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisor() {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				sum += i;
		}
		return sum;

	}

}
