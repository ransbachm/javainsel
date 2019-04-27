package com.insel.chapter5;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class FormatTest {
	
	public static void main (String ... args) {
		
		String name = "John";
		int a1 = 1;
		float a2 = (float) 10.2341;
		
		
		
		String f = String.format("User %s with id %d has %f currency.", name, a1, a2);
		
		System.out.println(f);
		
	}
	
	
	
	
}
