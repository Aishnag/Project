package com.runnable;

public class MyRunnable implements Runnable {
	public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        MyRunnable mrt = new MyRunnable();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnable.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

	
    public static int myCount = 0;
    public  MyRunnable(){
         
    }


	@Override
	public void run() {
	while(MyRunnable.myCount <= 10){
        try{
            System.out.println("Expl Thread: "+(++MyRunnable.myCount));
             Thread.sleep(100);
            } catch (InterruptedException ie) {
              System.out.println("Exception in thread: "+ie.getMessage());
            }

		
	}

	}}
