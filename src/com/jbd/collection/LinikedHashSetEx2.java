package com.jbd.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinikedHashSetEx2 {

	public static void main(String[] args) {

		Set<Integer> list4 = new LinkedHashSet<Integer>();

		//LinkedHashSet<Integer> ln = new LinkedHashSet<Integer>();
		
		list4.add(23);
		list4.add(34);
		list4.add(21);
		list4.add(1);
		
		System.out.println(list4);

		for (Integer integer : list4) {
			System.out.print(integer + " ");
		}
		
		
	}
}
