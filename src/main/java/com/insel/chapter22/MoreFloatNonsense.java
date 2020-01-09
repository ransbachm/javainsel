package com.insel.chapter22;

public class MoreFloatNonsense {
	public static void main(String [] args) {
		// Chapter 22.4.1 
		double d1 = 0.02d;
		float f1 = 0.02f;
		System.out.println(d1 == f1);
		System.out.println((float) d1 == f1);
		System.out.printf("%f %f%n", d1, f1);
		
		double d2 = 0.02f;
		float f2 = 0.02f;
		System.out.println(d2 == f2);
		System.out.printf("%f %f", d2, f2);
	}

}
