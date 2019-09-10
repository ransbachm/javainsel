package com.insel.chapter16;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThread {
	public static void main(String [] args) {
		ScheduledExecutorService s = Executors.newScheduledThreadPool(1);
		s.scheduleAtFixedRate(() -> {System.out.println("Kradness is great!");}, 0, 2, TimeUnit.SECONDS);
	}

}
