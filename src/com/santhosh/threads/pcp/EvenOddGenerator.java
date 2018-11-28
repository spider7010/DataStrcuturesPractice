package com.santhosh.threads.pcp;

public class EvenOddGenerator {

	private boolean odd;
	private int count = 1;
	private int MAX = 20;

	public void printOdd() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking Odd loop");
				while (!odd) {
					try {
						System.out.println("Odd waiting :" + count);
						wait();
						System.out.println("Odd notified: " + count);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count);
				odd = false;
				count++;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");
				while (odd) {
					try {
						System.out.println("Even waiting :" + count);
						wait();
						System.out.println("Even Notified :" + count);
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				}
				System.out.println("Even Thread :" + count);
				count++;
				odd = true;
				notify();
			}
		}
	}

	public static void main(String[] args) {

		EvenOddGenerator obj = new EvenOddGenerator();
		obj.odd = true;
		Thread oddThread = new Thread() {
			@Override
			public void run() {
				obj.printOdd();
			}
		};

		Thread evenThread = new Thread() {
			@Override
			public void run() {
				obj.printEven();
			}
		};

		oddThread.start();
		evenThread.start();

		try {
			oddThread.join();
			evenThread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
