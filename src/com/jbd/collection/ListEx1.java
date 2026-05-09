package com.jbd.collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

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
