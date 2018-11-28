package com.santhosh.collections;

import java.io.Serializable;

public class HashMapCustom<K, V> implements Serializable {

	private Entry<K, V>[] table; // Array of Entry.
	private int capacity = 4; // Initial capacity of HashMap

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	public HashMapCustom() {
		table = new Entry[capacity];
	}

	public void put(K newVal, V Data) {

	}
}
