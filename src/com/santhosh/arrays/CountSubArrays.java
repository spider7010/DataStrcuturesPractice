package com.santhosh.arrays;

public class CountSubArrays {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 3, 2, 3, 2 };
		int n = arr.length;

		int counter = 0;
		int predicate = 1;
		while (predicate <= n) {
			if (predicate == n && n % 2 == 0) {
				int odd = 0;
				int even = 0;
				for (int j = 0; j < n; j++) {
					if (arr[j] % 2 == 0)
						even++;
					else
						odd++;
				}
				if (odd == even)
					counter++;
			}
			for (int i = 0; i < n; i++) {
				boolean first = false;
				boolean last = false;
				if (i + predicate >= n) {
					break;
				}
				if (arr[i] % 2 == 0 && arr[i + predicate] % 2 == 1) {
					first = true;
				} else if (arr[i] % 2 == 1 && arr[i + predicate] % 2 == 0) {
					last = true;
				}

				if (first || last)
					counter++;
			}
			predicate += 1;
		}
		System.out.println("Total Sub Arrays are :" + counter);
	}
}
