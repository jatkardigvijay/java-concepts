package com.jbd.designpattern.builder;

public class Shop {

	public static void main(String[] args) {

		// So here in the phone object, I am passing all the values
		// sometimes I don't need all the values then what we do. It becomes a problem
		Phone p = new Phone("Android", 2, "Qualcomm", 5.5, 3100);
		System.out.println(p);
		System.out.println("===");
		// Hence used 'Builder' design pattern
		// created a 'PhoneBuilder' class and use it
		// we can set the params in any sequence too
		Phone p1 = new PhoneBuilder().setOs("Android").setBattery(3100).setRam(2).getPhone();
		System.out.println(p1);
	}
}
