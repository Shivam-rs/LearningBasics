package com.ooops.level2.inheritence;

public class Student extends Person {

	public Student(String name, String colleageName) {
		super(name);
		this.colleageName = colleageName;
	}

	private String colleageName;
	private int yearInCollege;

	public String getColleageName() {
		return colleageName;
	}

	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		this.yearInCollege = yearInCollege;
	}
}
