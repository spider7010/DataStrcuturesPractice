package com.santhosh.oops;

abstract class D{
	public abstract void fill();
}
class B extends D{

	@Override
	public void fill() {
		System.out.println("I am B");
	}
}

class C extends D{

	@Override
	public void fill() {
		System.out.println("I am C");
	}
}

public class A{
	

	public static void main(String[] args) {
		
		D obj = new B();
		obj.fill();
	}
}