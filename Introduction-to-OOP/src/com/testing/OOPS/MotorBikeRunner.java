package com.testing.OOPS;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike honda = new MotorBike(110);
		MotorBike bajaj = new MotorBike();

		honda.start();

		honda.setSpeed(99);

		honda.increaseSpeed(1);
		System.out.println(honda.getSpeed());

		honda.decreaseSpeed(31);
		System.out.println(honda.getSpeed());

	}


}
