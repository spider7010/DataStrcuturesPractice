package com.santhosh.collections;

public class Test extends BaseTest{

	
	public void display(String str) {
		System.out.println("test");
	}
	
	public static void main(String[] args) {
	 
		BaseTest test = new Test();
		test.display("hello");
	}
}
