package com.jbd.multithreading;

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("main begin");
		Thread t = Thread.currentThread();
		System.out.println(t); // Thread[#1,main,5,main]
		System.out.println("thread name : " + t.getName()); // main
		System.out.println("thread priority : " + t.getPriority()); // 5
		System.out.println("=====");
		t.setName("jbd");
		t.setPriority(9);
		System.out.println("thread name : " + t.getName()); // jbd
		System.out.println("thread priority : " + t.getPriority()); // 9
		System.out.println("main end");
	}
}
