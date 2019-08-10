package com.insel.chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NSAStream {
	public static void main(String [] args) {
		String [] words = {"1", "34", "35", "82", "-1"};
		List<Integer> numbers = new ArrayList<>();
		         
		Arrays.stream(words).map(Integer::parseInt).forEach(numbers::add);
		
		System.out.println(numbers);
		
		
	}

}
