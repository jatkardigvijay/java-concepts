package com.jbd.designpattern.factory;

import com.jbd.designpattern.factory.phone.Android;
import com.jbd.designpattern.factory.phone.IOS;
import com.jbd.designpattern.factory.phone.OperatingSystemFactory;
import com.jbd.designpattern.factory.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) {
		
		// here every time I have to change my code from 'IOS' to 'Windows' or 'Android' or in 
		// that case can be anything.
		// So our client knows what we are working with.
		// hence create a OperatingSystemfactory class and in there do the implementation
		// OS os = new IOS();
		// os.spec();
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getInstance("");
		os.spec();
	}
}
