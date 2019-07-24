package com.insel.chapter11;

public class Util {
	public static <T> T random(T t1, T t2) {
		return Math.random() > 0.5 ? t1 : t2;
	}
	
	public static void main(String [] args) {
		System.out.println(random(null, "Hi!"));
		
	}
	public static <E extends Comparable<E>> E min(E o1, E o2) {
		return o1.compareTo(o2) > 0 ? o2 : o1;
	}
}
