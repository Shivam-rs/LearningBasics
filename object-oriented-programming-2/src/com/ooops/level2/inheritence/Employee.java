package com.ooops.level2.inheritence;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employer;
	private char employeeGrade;
	private BigDecimal salary;


	public Employee(String name, char employeeGrade) {
		super(name);
		this.employeeGrade = employeeGrade;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%s, Employee Details - %s, %c", super.toString(), employer, employeeGrade);
	}
}
