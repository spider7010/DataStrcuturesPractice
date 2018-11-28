package com.santhosh.caching;

import java.util.Map.Entry;

public class ClientTest {

	public static void main(String[] args) {

		Employee obj1 = new Employee(1, "Santhosh", 10000);
		Employee obj2 = new Employee(2, "Chetan", 20000);
		Employee obj3 = new Employee(3, "Niranjan", 30000);
		Employee obj4 = new Employee(4, "vijay", 40000);
		Employee obj5 = new Employee(5, "Manas", 50000);

		Department dpt1 = new Department(100, "IT");
		Department dpt2 = new Department(101, "CSC");

		LRUCache<Employee, Department> cache = LRUCache.newInstance(3);

		cache.put(obj1, dpt1);
		cache.put(obj2, dpt2);

		cache.put(obj3, dpt1);
		cache.put(obj4, dpt1);
		cache.put(obj5, dpt2);

		for (Entry<Employee, Department> entry : cache.entrySet()) {
			Employee emp = entry.getKey();
			Department dept = entry.getValue();
			System.out.println(emp + " " + dept);
		}

	}

}
