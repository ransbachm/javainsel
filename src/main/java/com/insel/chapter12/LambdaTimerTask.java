package com.insel.chapter12;

import java.util.Timer;
import java.util.TimerTask;

public class LambdaTimerTask extends TimerTask {
	public static void main(String [] args) {
		
		//the constructor is given the runnable with overwriten run 
		new Timer().scheduleAtFixedRate(
				new LambdaTimerTask(() -> System.out.println("Hel.. llo. World==?")) , 0, 2000);
		
	}
	private final Runnable runnable;
	
	public LambdaTimerTask(Runnable runnable) {
		this.runnable = runnable;
		
		
	}
	
	@Override public void run() {
		runnable.run();
	}
}
