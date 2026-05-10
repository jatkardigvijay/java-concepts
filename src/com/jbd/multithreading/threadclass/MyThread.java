package com.jbd.multithreading.threadclass;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {  
            System.out.println("Thread running: " + i);  
        }  
		super.run();
	}

	
}
