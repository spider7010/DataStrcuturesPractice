package com.santhosh.threads.pcp;

import java.util.concurrent.BlockingQueue;

public class ConsumerQ implements Runnable {

	private final BlockingQueue<Integer> sharedQ;

	public ConsumerQ(BlockingQueue<Integer> cq) {
		this.sharedQ = cq;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("consumed value :" + sharedQ.take());
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
