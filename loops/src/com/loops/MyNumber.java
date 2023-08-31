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

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}


}
