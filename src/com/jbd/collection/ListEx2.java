package com.jbd.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(34);
		list.add(21);
		list.add(1);
		list.add(23);
		list.add(34);
		list.add(21);
		list.add(1);
		
		
		System.out.println(list);
		

		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println("Size of list is : "+list.size());
		
		
		System.out.println();
		System.out.println("=======");
		
		List<Integer> list1 = new LinkedList<Integer>();

		list1.add(23);
		list1.add(34);
		list1.add(21);
		list1.add(1);
		list1.add(23);
		list1.add(34);
		list1.add(21);
		list1.add(1);

		System.out.println(list);

		for (Integer integer : list) {
			System.out.print(integer + " ");
		
	}
}}
