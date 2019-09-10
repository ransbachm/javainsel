package com.insel.chapter16;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerThread {
	public static void main(String [] args) {
		ExecutorService ex = Executors.newCachedThreadPool();
		byte[] rand = new byte[50_000];
		new Random().nextBytes(rand);
		Callable<byte[]> cA = new ByteWorkerCallable(rand);
		Future<byte[]> firstSoundFromTheFuture = ex.submit(cA);
		// Do something else
		try {
			byte[] res = firstSoundFromTheFuture.get();
			System.out.printf("Done %d %d%n", res[0], res[res.length-1]);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		ex.shutdown();
	}
}

class ByteWorkerCallable implements Callable<byte[]> {
	private byte [] sort;
	public ByteWorkerCallable(byte [] sort) {
		this.sort = sort;
	}
	@Override public byte[] call() {
		Arrays.sort(sort);
		return sort;
	}
	
}
