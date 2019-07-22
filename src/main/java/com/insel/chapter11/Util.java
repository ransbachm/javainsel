package com.insel.chapter11;

public class Util {
	public static <T> T random(T t1, T t2) {
		return Math.random() > 0.5 ? t1 : t2;
	}
	
	public static void main(String [] args) {
		System.out.println(random(null, "Hi!"));
		
	}
}
