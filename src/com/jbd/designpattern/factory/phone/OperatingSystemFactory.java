package com.jbd.designpattern.factory.phone;

import com.jbd.designpattern.factory.OS;

public class OperatingSystemFactory {

	public OS getInstance(String osName) {
		
		if (osName.equals("Open")) {
			return new Android();
		} else if (osName.equals("Closed")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
