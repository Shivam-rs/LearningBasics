package com.arrays;

import java.util.Arrays;

public class ArraySort {

	public boolean isArraySorted(int[] arr) {
		// TODO Auto-generated method stub

		int[] lol = arr.clone();
		int k = new int[6];

		Arrays.sort(lol);

		for (int i = 0; i < lol.length; i++) {
			System.out.print(lol[i] + " ");

		}
		System.out.print("\n");
		for (int i = 0; i < lol.length; i++) {
			// System.out.print(lol[i]);
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
		if (Arrays.equals(lol, arr)) {
			return true;
		}
		return false;
	}

}
