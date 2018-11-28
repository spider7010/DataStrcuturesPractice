package com.santhosh.bitwise;

public class DivisionTest {

	public static void main(String[] args) {

		int a=10;
		int b=5;

		int count = 0;
		while(a >= b) {
			a = a-b;
			count ++;
		}
		System.out.println(count);
	}
}
