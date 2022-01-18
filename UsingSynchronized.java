package com.thread;

public class UsingSynchronized {

public static void main(String[] args) {
			MyTask task = new MyTask();
			
			Thread first = new Thread(task);
			Thread second = new Thread(task);
			Thread third = new Thread(task);
			
			first.setName("Ramya");
			second.setName("Raj");
			third.setName("Aishu");
			
			first.start();
			second.start();
			third.start();

		}

	}

class MyTask implements Runnable{
		@Override
		public void run() {
			synchronized (this) {
				for(int index = 1; index < 4; index++) {
					System.out.println(Thread.currentThread().getName() + ", index : " + index);
				}	
			}
			
		}
	}

