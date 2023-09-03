package com.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private int[] marks;
	private String name;
	private int sum = 0;

	public Student(String name, int[] marks) {
		this.name = name;

		this.marks = marks;

		Arrays.sort(marks);
	}

	int length;
	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		length = marks.length;
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}



	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		// int length = marks.length;
		return marks[length - 1];
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		return marks[0];
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		// int length = marks.length;
		return new BigDecimal(sum).divide(new BigDecimal(length), 3, RoundingMode.UP);
	}

}
