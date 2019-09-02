package com.insel.chapter16;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NFOThread {
	public static void main(String [] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {IntStream.range(0, 20).forEach(System.out::println);});
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(10); // wait 10 milis
		System.out.println(t1.getState());
		System.out.println(Arrays.toString(Thread.State.values()));
		System.out.println(t1.getName() + " " + t1.getId());
		Thread cT = Thread.currentThread(); // Slow call; cache if called twice
		System.out.printf("%s %d", cT.getName(), cT.getId()); 
		/* Note: %s is possible because of wrapping, you can use %d (for numbers) */
	}

}
