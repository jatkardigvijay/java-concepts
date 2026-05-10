package com.jbd.multithreading.runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Runnable Thread: " + i);
		}
		
	}

	
}
