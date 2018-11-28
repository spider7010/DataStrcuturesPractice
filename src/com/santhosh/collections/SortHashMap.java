package com.santhosh.collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {

	public static void main(String[] args) {

		List<HashMap<String, String>> list = new ArrayList<>();

		HashMap<String, String> map4 = new HashMap<String, String>();
		map4.put("postDate", "10/05/2018");
		map4.put("description", "Fifth Transaction");
		map4.put("amount", "$400");
		list.add(map4);

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("postDate", "04/05/2018");
		map3.put("description", "Fourth Transaction");
		map3.put("amount", "$300");
		list.add(map3);

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("postDate", "01/05/2018");
		map1.put("description", "second Transaction");
		map1.put("amount", "$00");
		list.add(map1);

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("postDate", "03/06/2018");
		map2.put("description", "Third Transaction");
		map2.put("amount", "$200");
		list.add(map2);

		HashMap<String, String> map5 = new HashMap<String, String>();
		map5.put("postDate", "17/05/2018");
		map5.put("description", "Sixth Transaction");
		map5.put("amount", "$500");
		list.add(map5);

		Collections.sort(list, new Comparator<Map<String, String>>() {
			DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			public int compare(final Map<String, String> o1, final Map<String, String> o2) {
				try {
					return sdf.parse(o2.get("postDate")).compareTo(sdf.parse(o1.get("postDate")));
				} catch (ParseException e) {
					throw new IllegalArgumentException(e);
				}
			}
		});

		for (HashMap<String, String> map : list) {
			System.out.println(map.get("postDate"));
		}
	}
}
