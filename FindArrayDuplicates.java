package com.santhosh.ds.misc;

public class FindArrayDuplicates {

	public static void main(String[] args) {

		int[] arr = { 2, 8, 3, 6, 7, 1, 7 };
		if (checkDuplicates(arr, arr.length))
			System.out.println("Array has duplicate elements");
		else
			System.out.println("Array doesn't have duplicate elements");
	}

	public static boolean checkDuplicates(int[] arr, int length) {
		int value = 0;
		boolean isDupFound = false;
		for (int i = 0; i < length; i++) {
			int currChar = arr[i];
			int bit_Position = currChar - 'a';
			if ((value & (1 << bit_Position)) > 0) {
				isDupFound = true;
				break;
			} else {
				value = value | (1 << bit_Position);
			}
		}
		return isDupFound;
	}
}
