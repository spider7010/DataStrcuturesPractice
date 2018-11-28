package com.santhosh.collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDesc {

	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		queue.add(3);
		queue.add(1);
		queue.add(7);
		queue.add(6);
		queue.add(5);
		queue.add(2);
		queue.add(9);
		queue.add(8);
		queue.add(10);

		Object[] arr = new Object[queue.size()];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = queue.remove();
		}

		System.out.println(Arrays.toString(arr));
	}
}
