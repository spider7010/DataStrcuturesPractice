package com.santhosh.caching;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 8704007821521717792L;

	private static int size;
	
	private LRUCache(int size){
		LRUCache.size = size;
	}
	
	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		LRUCache.size = size;
	}

	@Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }
	
	public static <K, V> LRUCache<K, V> newInstance(int size){
		return new LRUCache<K,V>(size);
	}
}
