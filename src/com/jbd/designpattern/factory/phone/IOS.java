package com.jbd.designpattern.factory.phone;

import com.jbd.designpattern.factory.OS;

public class IOS implements OS {

	@Override
	public void spec() {
		System.out.println("Most secure OS");
	}
}
