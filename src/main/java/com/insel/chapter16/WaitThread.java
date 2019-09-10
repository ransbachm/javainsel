package com.insel.chapter16;

import java.util.concurrent.ThreadLocalRandom;

public class WaitThread {
	public static void main(String [] args) throws InterruptedException {
		Thread a = new Thread(getWaitRunnable());
		Thread b = new Thread(getWaitRunnable());
		Thread c = new Thread(getWaitRunnable());
		
		a.start();
		b.start();
		c.start();
		
		a.join();
		b.join();
		c.join();
		
		System.out.println("Done!");
		
	}
	
	
	
	
	public static Runnable getWaitRunnable() {
		return () -> {
			// 1000 + 1 to include 1000, compiler shold optimize that 'away'
			int rand = ThreadLocalRandom.current().nextInt(1, 1000+1);
			System.out.printf("Waiting: %d ms %s%n", rand, Thread.currentThread().getName());
			try {
				Thread.sleep(rand);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("Done waiting: %s%n", Thread.currentThread().getName());
		};
	}

}
