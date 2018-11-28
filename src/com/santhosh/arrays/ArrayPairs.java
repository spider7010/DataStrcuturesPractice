package com.santhosh.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayPairs {

	public static void main(String[] args) {
		int[] arr = {1,2,3,-1,4,6};
		findpairs(arr, arr.length, 3);
	}

	private static void findpairs(int[] arr, int length, int sum) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i< length; i++) {
			int val = sum - arr[i];
			
			if(set.contains(val))
				System.out.println("{"+arr[i]+", "+val+"}");
			set.add(arr[i]);
		}
	}

}
