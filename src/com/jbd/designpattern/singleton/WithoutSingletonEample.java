package com.jbd.designpattern.singleton;

public class WithoutSingletonEample {

	public static void main(String[] args) {

		// If I have a class ABbc and I create an instance
		// So when I create an instance obj1 it will have different values and
		// obj2 will have different values
		// But what if you want everyone to create one instance of your class
		// then create a singleton class.
		// since in the single t
		Abc obj1 = new Abc();
		Abc obj2 = new Abc();
		System.out.println("===");
		
	}
}

class Abc {

	
}

