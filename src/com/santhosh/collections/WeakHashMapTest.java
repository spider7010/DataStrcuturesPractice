package com.santhosh.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {

		Movie movie = new Movie();
		
		//Hashmap
		HashMap<Movie,String> map = new HashMap<Movie,String>();
		map.put(movie, "Hollywood");
		movie=null;
		System.gc();
		map.forEach((k,v)->System.out.println("movie : " + k + " Industry : " + v));
		
		//Weakhashmap
		
		WeakHashMap<Movie,String> map1 = new WeakHashMap<Movie,String>();
		map1.put(movie, "Hollywood");
		movie=null;
		System.gc();
		map1.forEach((k,v)->System.out.println("movie : " + k + " Industry : " + v));
		System.out.println(map1.get(movie));
		
	}
}
