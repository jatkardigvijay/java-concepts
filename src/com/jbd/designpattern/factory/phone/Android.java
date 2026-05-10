package com.jbd.designpattern.factory.phone;

import com.jbd.designpattern.factory.OS;

public class Android implements OS {

	@Override
	public void spec() {
		System.out.println("Most Powerful OS");
	}
}
