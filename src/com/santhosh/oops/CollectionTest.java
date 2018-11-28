package com.santhosh.oops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionTest {

	public static void main(String[] args) {

		Employee e1 = new Employee("Santhosh", 123, "Sr. Software Engineer");
		Employee e2 = new Employee("Santhosh", 123, "Sr. Software Engineer");
		Employee e3 = new Employee("Santhosh", 123, "Sr. Software Engineer");
		Employee e4 = new Employee("ssantosh", 456, "Principle Engineer");
		Employee e5 = new Employee("ssanthosh", 786, "MTS");
		Employee e6 = new Employee("Santhosh Surimani", 573, "SMTS");
		
		HashSet<Employee> set = new HashSet<>();
		Map<Employee,Integer> map = new HashMap<>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		
		map.put(e1, 1);
		map.put(e2, 2);
		map.put(e3, 3);
		map.put(e4, 4);
		map.put(e5, 5);
		map.put(e6, 6);
		
		/*System.out.println("set size :"+set.size());
		for(Employee e:set){
			System.out.println(e.getName());
		}*/
		System.out.println(map.size());
		System.out.println("Key :"+map.get(new Employee("Santhosh", 123, "Sr. Software Engineer")));
		map.entrySet().forEach(i -> System.out.println(i.getKey()));
	}
}
