package com.insel.chapter22;

public class FloatNonsense {
	public static void main(String [] args) {
		long tStart = System.nanoTime();
		
		float a = -44f;
		float b = -2.2f;
		
		long t1 = System.nanoTime() - tStart;
		System.out.println(a%b);
		
		long t2 = System.nanoTime() - tStart;
		System.out.println(getRemainder(a, b));
		long t3 = System.nanoTime() - tStart;
		
		System.out.println(Math.pow(0, 0));
		
		System.out.printf("%d : %d %d %d", tStart, t1, t2, t3);
	}
	
	static double getRemainder(double a, double b) {
		return Math.signum(a) * Math.round(Math.abs(a) - Math.abs(b) * Math.round(Math.abs(a) / Math.abs(b)));
	}
}
