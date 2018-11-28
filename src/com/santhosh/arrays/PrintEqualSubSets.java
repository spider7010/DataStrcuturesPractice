package com.santhosh.arrays;

class PrintEqualSubSets {

	static void printSolution(boolean[][] part, int[] arr, int i, int j) {
		if (!part[i][j] || i == 0)
			return;

		if (part[i][j - 1])
			printSolution(part, arr, i, j - 1);
		else {
			printSolution(part, arr, i - arr[j - 1], j - 1);
			System.out.print(arr[j - 1] + " ");
		}
	}

	static boolean isSubsetSum(int[] arr, int sum) {
		int n = arr.length;

		boolean[][] part = new boolean[sum + 1][n + 1];

		for (int i = 1; i < sum + 1; i++)
			part[i][0] = false;

		for (int j = 0; j < n + 1; j++)
			part[0][j] = true;

		for (int i = 1; i < sum + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				part[i][j] = part[i][j - 1];
				if (i >= arr[j - 1])
					part[i][j] = part[i][j] || part[i - arr[j - 1]][j - 1];
			}
		}

		if (part[sum][n]) {
			System.out.println("One subset with required sum : ");
			printSolution(part, arr, sum, n);
			System.out.println();
		}

		return part[sum][n];
	}

	static boolean findPartition(int[] arr) {
		int n = arr.length;

		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		if ((sum & 1) == 1)
			return false;

		return isSubsetSum(arr, sum / 2);
	}

	static void printMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	static void printArray(int[] arr) {
		for (Integer i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 9, 12 };

		if (findPartition(arr))
			System.out.println("\nYES");
		else
			System.out.println("\nNO");
	}
}