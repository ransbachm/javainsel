package com.insel.chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NSAStream {
	public static void main(String [] args) {
		new NSAStream().doStuff(); //This is for using the this reference
	}
	
	public void doStuff() {
		String [] words = {"1", "34", "35", "82", "-1"};
		List<Integer> numbers = new ArrayList<>();
		         
		Arrays.stream(words).map(Integer::parseInt).map(this::oneUp).forEach(numbers::add);
		
		System.out.println(numbers);
	}
	public int oneUp(int num) {
		return num+1;
	}

}
