package com.testing.OOPS;

public class MotorBike {

	private int speed;

	public MotorBike() {
		this(2);
	}

	public MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("Brum Brum");
		// speed = 0;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(speed - howMuch);
	}
}
