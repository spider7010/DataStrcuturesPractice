package com.santhosh.arrays;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 1,2,3 };
		int sortedArray[] = rearrange(arr);
		for (int i : sortedArray) {
			System.out.println(i);
		}
	}

	static int[] rearrange(int[] elements) {
		int[] aux = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			aux[i] = Integer.bitCount(elements[i]);
		}

		for (int i = 1; i < (elements.length); i++) {
			int key1 = aux[i];
			int key2 = elements[i];
			int j = i - 1;
			while (j >= 0 && aux[j] > key1) {
				aux[j + 1] = aux[j];
				elements[j + 1] = elements[j];
				j = j - 1;
			}
			aux[j + 1] = key1;
			elements[j + 1] = key2;
		}
		return elements;
	}
}
