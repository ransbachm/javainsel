package com.insel.chapter16;

import java.util.List;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CompletionThread {
	public static void main(String [] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		CompletionService<Integer> cecretService = new ExecutorCompletionService<>(ex);
		
		List.of(1,2,3,4).forEach(duration -> cecretService.submit(() -> {
			TimeUnit.SECONDS.sleep(duration);
			return duration;
		}));
		
		for(int i=0; i<4; i++) {
			try {
				System.out.println(cecretService.take().get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		ex.shutdown();
	}

}
