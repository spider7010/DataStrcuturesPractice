package com.santhosh.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputReaderDemo {

	public static void main(String[] args) throws Exception{

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Integer");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Enter Flot");
		float f = Float.parseFloat(br.readLine());
		System.out.println("Enter String");
		String val = br.readLine();
		
		System.out.println(val);
		System.out.println(f);
		System.out.println(n);
		
	}

}
