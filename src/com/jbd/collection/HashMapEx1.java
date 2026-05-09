package com.jbd.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Grapes");
		map.put(103, "Bananas");
		map.put(102, "Mangoes");
		map.put(102, "Apples");
		map.put(104, "Bluberries");
		map.put(102, "Raspberry");
		map.put(103, "Bananas");
		
		

		System.out.println(map);
	}
}
