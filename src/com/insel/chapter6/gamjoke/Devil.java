package com.insel.chapter6.gamjoke;

public class Devil extends Sister{
	
	public static void main(String ... args) {
		
		Testament Testament = new Testament();
		
		print(Testament instanceof Sister, new Devil());
		
	}
	static void print(boolean b, Object o) {
		System.out.println(b);
	}

}
