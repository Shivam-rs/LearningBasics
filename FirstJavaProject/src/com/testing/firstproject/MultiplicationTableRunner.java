package com.testing.firstproject;

public class MultiplicationTableRunner {

	public static void main(String[] args) {

		MultiplicationTable table = new MultiplicationTable();
		table.printTable();
		table.printTable(3);
		table.printTable(4, 2, 6);
		System.out.println("Well Done");

	}

}
