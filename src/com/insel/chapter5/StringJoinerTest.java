package com.insel.chapter5;

import java.util.Date;
import java.util.StringJoiner;

public class StringJoinerTest {
	public static void main(String ... args) {
		
		StringJoiner j = new StringJoiner(", ", "{", "}");
		
		
		
		int r = (int) (Math.random() * 10) + 3;
		
		for(int i=0; i<r; i++) {
			j.add(Double.toString(Math.random() * 10 +1).substring(0, 3));
		}
		
		System.out.println(j.toString());
		
	}
}
