package com.santhosh.oops;

public class Test {

	public static void main(String[] args) {

		String str = "04:36:39,938 c.y.a.g.s.g.h.GenericEntityHandler Scraping field:[accountHolder]"
				+ " with uuid:[DiscoverBase_E05EBADA-6CB8-4DCE-8304-DA1693633475]";
		
		String fieldName = str.substring(str.indexOf("field:[")+7, str.indexOf("]"));
		System.out.println(fieldName);
		
		String uuid = str.substring(str.indexOf("uuid:[")+6, str.lastIndexOf("]"));
		System.out.println(uuid);
	}

}
