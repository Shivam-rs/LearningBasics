package com.arrays;

public class ArraySortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySort arraySorted = new ArraySort();
		int[] arr = { 1, 2, 3, 5, 4 };
		boolean isArraySorted = arraySorted.isArraySorted(arr);
		System.out.println(isArraySorted);
	}

}
