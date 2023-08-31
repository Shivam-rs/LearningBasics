package com.testing.firstproject;

public class MultiplicationTable {
	//5*1 =5 to 5*10 =10
	void printTable() {
		printTable(5);
	}

	void printTable(int table) {
		printTable(table, 1, 10);
	}

	void printTable(int table, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}

		System.out.println();

	}
}
