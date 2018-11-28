package com.santhosh.threads.pcp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQImpl {

	public static void main(String[] args) {

		BlockingQueue<Integer> sharedQ = new LinkedBlockingQueue<>();

		Thread pr = new Thread(new ProdcuerQ(sharedQ), "Producer");

		Thread cr = new Thread(new ConsumerQ(sharedQ), "Consumer");

		pr.start();
		cr.start();
	}

}
