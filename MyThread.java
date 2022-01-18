package com.thread;

public class MyThread  extends Thread{

	public static void main(String[] args) {
	     MyThread thread = new MyThread();
	     thread.start();
	    System.out.println(Thread.currentThread().getName());

	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) 
			
		System.out.println("Number is:"+i);
		System.out.println(Thread.currentThread().getName());
	}

}
