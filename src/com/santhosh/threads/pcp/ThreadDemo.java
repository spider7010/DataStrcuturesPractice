package com.santhosh.threads.pcp;

public class ThreadDemo extends Thread{

	@Override
	public void run() {
		System.out.println("run");
	}
	public static void main(String[] args) throws InterruptedException {

		ThreadDemo obj= new  ThreadDemo();
		Thread t = new Thread(obj);
		t.run();
		t.start();
		
	}
}
