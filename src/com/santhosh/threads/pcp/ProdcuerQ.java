package com.santhosh.threads.pcp;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProdcuerQ implements Runnable {

	private final BlockingQueue<Integer> sharedQ;

	public ProdcuerQ(BlockingQueue<Integer> pq) {
		this.sharedQ = pq;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Random random = new Random();
				int number = random.nextInt(100);
				System.out.println("Producing value " + number);
				sharedQ.put(number);
			} catch (InterruptedException ie) {
				System.err.println("Error :: " + ie);
			}
		}
	}
}
