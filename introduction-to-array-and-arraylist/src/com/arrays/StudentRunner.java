package com.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 9, 98, 100 };
		Student student = new Student("Shivam", marks);

		/*
		 * System.out.println(Arrays.toString(marks)); String z =
		 * Arrays.toString(marks), xx = "IDK"; System.out.println(z + xx);
		 */
		int numberOfMarks = student.getNumberOfMarks();
		System.out.println("numberOfMarks :" + numberOfMarks);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum :" + sum);

		int maxMarks = student.getMaximumMarks();
		System.out.println("maxMarks :" + maxMarks);

		int minMarks = student.getMinimumMarks();
		System.out.println("minMarks :" + minMarks);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average :" + average);
		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarksAtIndex(2);
		System.out.println(student);
	}

}
