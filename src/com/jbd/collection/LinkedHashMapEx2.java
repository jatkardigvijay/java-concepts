package com.jbd.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx2 {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(101, "Grapes");
		map.put(109, "Bananas");
		map.put(103, "Bananas");
		map.put(102, "Mangoes");
		map.put(102, "Apples");
		map.put(104, "Bluberries");
		map.put(102, "Raspberry");
		;

		System.out.println(map);
	}
}
