package com.insel.chapter16;

public class InteruptThread {
	public static void main(String [] args) throws InterruptedException {
		Thread a = new Thread(getRunnable());
		a.start();
		Thread.sleep(2500);
		a.interrupt();
		
	}
	
	static Runnable getRunnable() {
		return () -> {
			Thread cT = Thread.currentThread();
			while(!cT.isInterrupted()) {
				try {
					System.out.println("Ich mag Sudoku nicht Goku!");
					Thread.sleep(500);
				} catch(InterruptedException e) {
					System.out.printf("Interrupted! But isInterrupted() : %s%n", cT.isInterrupted());
					cT.interrupt(); // ReIntrrupt + SecondImpact
				}
			}
			System.out.println("After"); // Note : continuing after the interrupt is possible
		};
	}

}
