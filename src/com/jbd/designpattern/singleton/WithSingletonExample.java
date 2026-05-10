package com.jbd.designpattern.singleton;

public class WithSingletonExample {

	public static void main(String[] args) {

		// If I have a class Abc and I create an instance
		// So when I create an instance obj1 it will have different values and
		// obj2 will have different values as given below (code commented as giving CE
		// error after singleton implementation)
		// But what if you want everyone to create one instance of your class
		// then create a singleton class.
		// Abc obj1 = new Abc();
		// Abc obj2 = new Abc();
		System.out.println("===");
		// Steps:
		// 1. create static object/instance of this class
		// 2. create a private constructor
		// 3. create a static method which would return the object
		// in this way we only allow one instance of that class
		// now it is called as follows
		Omg obj = Omg.getInstance();
		Omg obj3 = Omg.getInstance();
		System.out.println(obj == obj3);  // true
        System.out.println(obj.hashCode());
        System.out.println(obj3.hashCode());
	}
}

class Omg {

	// static instance
	static Omg obj = new Omg();

	// create a private constructor
	private Omg() {
		super();
	}

	// create a static method which would return the object
	public static Omg getInstance() {
		return obj;
	}
}