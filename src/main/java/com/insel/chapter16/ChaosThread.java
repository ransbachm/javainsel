package com.insel.chapter16;

import java.util.ArrayList;

public class ChaosThread {
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String [] args) throws InterruptedException {
		Thread t1 = new Thread(new Chaos());
		Thread t2 = new Thread(new Chaos());
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		list.stream().forEach(System.out::println);
	}
	
	private static class Chaos implements Runnable {
		@Override public void run() {
			//synchronized (Chaos.class) { // Without synchronized the output will not be in order
				for(int i=0; i<100; i++) {
					ChaosThread.list.add(i);
				}
			//}
		}
	}

}
