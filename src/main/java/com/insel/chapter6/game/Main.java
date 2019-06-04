package com.insel.chapter6.game;

import java.io.PrintStream;

public class Main {
	public static void main(String [] args) {
		
		PrintStream o = System.out;
		Door d = new Door(1337);
		
		Key k1 = new Key(1);
		Key k2 = new Key(99);
		Key k4 = new Key(1337);
		
		o.println(k1.useOn(d));
		o.println(k2.useOn(d));
		o.println(k4.useOn(d));
		
		Chocolate S1 = new Chocolate();
		Magazine M1 = new Magazine();
		Magazine EXPM = new Magazine(5.66);
		
		o.println(PriceUtills.calculateSum(M1));
		o.println(PriceUtills.calculateSum(S1, M1, EXPM));
		
		
		
	}

}
