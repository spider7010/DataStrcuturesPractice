package com.santhosh.arrays;

public class MinIronManEnergy {

	private static int[] arr = { 5, -6, -3, 5, 1, 1, 0, 9 };

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr.length - (1 + i) == i)
				break;
			sum += arr[i];
			if (sum < 1) {
				
			}
			sum += arr[arr.length - (1 + i)];
			if (sum < 1) {

			}
		}
		System.out.println(sum);
	}

}
