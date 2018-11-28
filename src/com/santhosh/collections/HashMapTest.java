package com.santhosh.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Student,String> map = new HashMap<>();
		
		Student s1 = new Student("24-07-1987", "Santhosh");
		Student s2 = new Student("24-07-1986", "Santhosh");
		Student s3 = new Student("01-07-1987", "Santhosh");
		
		map.put(s1, "1");
		map.put(s2, "2");
		map.put(s3, "3");
		
		System.out.println(map.get(new Student("24-07-1987", "Santhosh")));
		
		for(Entry<Student, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}

}
