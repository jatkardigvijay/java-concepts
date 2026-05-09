package com.jbd.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<Integer> list = new HashSet<Integer>();

		list.add(23);
		list.add(34);
		list.add(21);
		list.add(1);

		System.out.println(list);

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		
		
	}
}
