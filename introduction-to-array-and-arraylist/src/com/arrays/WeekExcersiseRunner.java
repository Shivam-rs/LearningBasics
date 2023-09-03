package com.arrays;

public class WeekExcersiseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] weeDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		WeekExcersise weekName = new WeekExcersise(weeDays);

		String logestName = weekName.logestWeekDayName();
		System.out.println("Longest Name in the week is " + logestName);
		weekName.printBackwards();

	}

}
