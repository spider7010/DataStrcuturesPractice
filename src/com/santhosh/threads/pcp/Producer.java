package com.santhosh.threads.pcp;

public class Producer implements Runnable {

	@Override
	public void run() {
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) throws Exception{
	
		System.out.println("started :"+args.length);
		for(int i=0;i<args.length;i++) {
			Thread t = new Thread(new Producer());
			t.setName(args[i]);
			t.start();
		}
	}
	
	public String toString() {
		return Thread.currentThread().getName();
	}
}
