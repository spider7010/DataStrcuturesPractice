package com.santhosh.immutable;

import java.util.HashMap;

public class Mutable extends Immutable {

	private int realValue;

	public Mutable(int value) {
		super(value);
		this.realValue = value;
	}

	@Override
	public int getValue() {
		return realValue;
	}

	public void setValue(int value) {
		realValue = value;
	}

	public String getName() {
		return "child";
	}
	
	public static void main(String[] args) {

		Mutable obj = new Mutable(5);

		Immutable im = (Immutable) obj;

//		System.out.println(im.getValue());

//		System.out.println(im.getValue());
		Mutable obj1 = new Mutable(50);
		HashMap<Immutable,String> map = new HashMap<>();
		
		map.put(obj, "1");
		map.put(im, "2");
		map.put(obj1 , "3");
		obj1.setValue(10);
		
		Object val = map.get(obj1);
		System.out.println(val);
		
	}
}
