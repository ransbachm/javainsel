package com.insel.chapter6;

import java.io.PrintStream;

public class Main {
	public static void main(String [] args) {
		
		PrintStream o = System.out;
		
		GameObject wunderHarke = new GameObject("Die Wunderharke 5000");
		Room myRoom = new Room("Der Raum in dem ich sitze.");
		
		
		
		
		
		o.println(wunderHarke);
		o.println(myRoom);
		
	}
	

}
