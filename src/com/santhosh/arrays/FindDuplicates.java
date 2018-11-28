package com.santhosh.arrays;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3 };

		boolean flag = checkDuplicates(arr, arr.length);
		System.out.println(flag);
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
