package com.insel.chapter17;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WaybackList {
	public static void main(String [] args) {
		
		/* In sets every element can only occour once
		 * Objects in sets have to be immutable (effectivly)
		 * If not weird things can happen
		 */
		
		@SuppressWarnings("unused")
		Set<Point> tS = new TreeSet<>(); // Slower but allways sorted
		Set<Point> hS = new HashSet<>(); // Faster but not sortet
		
		Point p1 = new Point(), p2 = new Point();
		System.out.printf("P1 equals P2: %b%n", p1.equals(p2)); // Same because both (0,0)
		
		System.out.printf("Add P1 1. time: %b%n", hS.add(p1)); // Success -> true
		System.out.printf("Add P1 2. time: %b%n", hS.add(p1)); // Already there (== and equals) -> false
		System.out.printf("Add P2 1. time: %b%n", hS.add(p2)); // Already there (only equals) -> flase
		
		System.out.printf("Set contains : P1[%b]  P2[%b]", hS.contains(p1), hS.contains(p2));
		//Both true because the Point in the Set equals both points (only == with p1)
		
	}

}
