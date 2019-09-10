package com.insel.chapter16;

public class WaitThread {
	public static void main(String [] args) throws InterruptedException {
		
		Thread a = new Thread(RunnableProvider.getWaitRunnable());
		Thread b = new Thread(RunnableProvider.getWaitRunnable());
		Thread c = new Thread(RunnableProvider.getWaitRunnable());
		
		a.start();
		b.start();
		c.start();
		
		a.join();
		b.join();
		c.join();
		
		System.out.println("Done!");
		
	}

}
