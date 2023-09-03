package com.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private ArrayList<Integer> marks = new ArrayList<Integer>();
	private String name;
	private int sum = 0;

	public Student(String name, int[] marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
		// Arrays.sort(marks);
	}


	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		// length = marks.length;;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		// TODO Auto-generated method stub
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}



	public int getMaximumMarks() {
		return Collections.max(marks);
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {

		return new BigDecimal(sum).divide(new BigDecimal(marks.size()), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);

	}

	public void removeMarksAtIndex(int index) {
		// TODO Auto-generated method stub
		marks.remove(index);
	}

}
