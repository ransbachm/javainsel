package com.insel.chapter22;

public  /*strictfp*/class NotSoQuickMaths {
	public static void main(String [] args) {
		strictMaths();
		notSoStrictMaths();
	}
	static strictfp void strictMaths() {
		System.out.println(Math.tan(33));
		System.out.println(StrictMath.tan(33));
	}
	static void notSoStrictMaths() {
		System.out.println(StrictMath.tan(33));
		System.out.println(Math.tan(33));
	}

}
