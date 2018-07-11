package com.santhoh.ds.heap;

import java.util.PriorityQueue;

public class ConnectRopes {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		int res = getMinCost(arr, arr.length);
		System.out.println(res);
	}

	private static int getMinCost(int[] arr, int length) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < length; i++) {
			pq.add(arr[i]);
		}

		int res = 0;
		while (pq.size() > 1) {
			int first = pq.poll();
			int second = pq.poll();

			res += first + second;
			pq.add(first + second);
		}
		return res;
	}
}
