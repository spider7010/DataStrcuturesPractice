package com.santhosh.immutable;

class Immutable {

	private final int value;

	public Immutable(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return "parent";
	}
}
