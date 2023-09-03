package com.arrays;

public class WeekExcersise {

	private String[] weekDays;

	public WeekExcersise(String[] weekDays) {
		this.weekDays = weekDays;
	}

	public String logestWeekDayName() {
		int max = 0;
		String longestName = "";
		for(String weekDay: weekDays) {
			if (weekDay.length() > max) {
				longestName = weekDay;
				max = weekDay.length();
			}
		}
		return longestName;
	}

	public void printBackwards() {
		System.out.print("BackWards Display would be like:  ");
		for (int i = (weekDays.length - 1); i >= 0; i--) {
			System.out.print(weekDays[i] + " ");
		}

	}

}
