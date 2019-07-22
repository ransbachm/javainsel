package com.insel.chapter10;

public enum Weekday {
	
	MONDAY,TUESDAY,WENSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	static {
		System.out.println("Static initializer");
	}
	
	{
		System.out.println("Object initializer");
	}
	
	Weekday() {
		System.out.println("Constructor");
	}
	
	public static void main(String [] args) {
		System.out.println(WENSDAY);
	}
}
