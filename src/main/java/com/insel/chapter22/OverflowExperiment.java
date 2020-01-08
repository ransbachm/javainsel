package com.insel.chapter22;

public class OverflowExperiment {
	public static void main(String [] args) {
		
		int a = (100_000*100_000/100_000);
		int b = Integer.MAX_VALUE;
		System.out.printf("%d %d%n%n", a, b+1);
		
		long c = Integer.MAX_VALUE * Integer.MAX_VALUE;
		long d = (long) (Integer.MAX_VALUE * Integer.MAX_VALUE); 
		long e = (long) Integer.MAX_VALUE * Integer.MAX_VALUE; // ONLY CASTS THE FIRST variable BUT long * int -> long
		System.out.printf("%d %d %d", c, d, e);
	}

}
