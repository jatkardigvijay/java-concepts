package com.jbd.designpattern.factory;

import com.jbd.designpattern.factory.phone.Android;
import com.jbd.designpattern.factory.phone.IOS;
import com.jbd.designpattern.factory.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		
		// here every time I have to change my code from IOS to Windows or android or in 
		// that case can be anything.
		OS os = new IOS();
		os.spec();
	}
}
