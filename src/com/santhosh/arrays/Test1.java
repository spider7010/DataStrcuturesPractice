package com.santhosh.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(calculate(3, 12));
	
	}

	private static List<Long> calculate(long a, long b) {
		
		long maxCount = 0;
		Map<Long, Long> map = new HashMap<>();
		List<Long> list = new ArrayList<>();
		for (long i = a; i <= b; i++) {
			long sum = getSum(i);
			Long count = map.get(sum);
			if (count != null) {
				map.put(sum, count + 1);
				if (count >= maxCount) {
					maxCount = count + 1;
				}
			} else {
				map.put(sum, (long) 1);
				if (maxCount < 1) {
					maxCount = 1;
				}
			}

		}
		long occurences = 0;
		for (Long e : map.values()) {
			if (e == maxCount)
				occurences++;
		}

		list.add(occurences);
		list.add(maxCount);
		return list;

	}

	static long getSum(long n) {
		long sum;
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;
		return sum;
	}
}
