package com.insel.chapter11;

import java.util.Arrays;
import java.util.List;

public class ExplicitTypeargument {
	public static void main(String [] args) {
		//Example on how generics can change the result, this can be overseen quickly
		
		String[] array = new String[] {"A", "B"};
		
		List<String> a = Arrays.asList(array);
		List<String[]> b = Arrays.<String[]>asList(array);
		
		System.out.println(array);
		System.out.println(a);
		System.out.println(b);
	}

}
