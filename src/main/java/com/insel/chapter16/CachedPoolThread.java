package com.insel.chapter16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedPoolThread {
	
	static void print(ExecutorService ex, Runnable r1, Runnable r2) {
		ex.execute(r1);
		ex.execute(r2);
	}
	
	public static void main(String [] args) throws InterruptedException {
		Runnable r1 = () -> {
			System.out.printf("Mark 1.1 in: %s%n", Thread.currentThread().getName());
			System.out.printf("Mark 1.2 in: %s%n", Thread.currentThread().getName());
		};
		Runnable r2 = () -> {
			System.out.printf("Mark 2.1 in: %s%n", Thread.currentThread().getName());
			System.out.printf("Mark 2.1 in: %s%n", Thread.currentThread().getName());
		};
		
		ExecutorService ex = Executors.newCachedThreadPool();
		
		System.out.println("Thread 1-4");
		print(ex, r1, r2);
		print(ex, r1, r2);
		
		Thread.sleep(500);
		
		System.out.println("\nAny 2 Threads");
		
		print(ex, r1, r2);
		
		Thread.sleep(500);
		
		print(ex, r1, r2);
		
		
		
		ex.shutdown();
	}

}