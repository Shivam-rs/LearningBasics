package com.ooops.level2.inheritence;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Student student = new Student();
		 *
		 * student.setName("Shivam"); student.setName("Singh");
		 * student.setEmail("sh@gmail.com"); student.setPhoneNumber("77440 1111");
		 *
		 * System.out.print(student);
		 */

		Employee employee = new Employee("Shivam", 'B');

		employee.setEmail("sh@gmail.com");
		employee.setPhoneNumber("77440 1111");
		employee.setEmployeeGrade('A');
		System.out.print(employee);

	}

}
