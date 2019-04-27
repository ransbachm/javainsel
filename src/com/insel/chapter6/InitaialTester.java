package com.insel.chapter6;

public class InitaialTester {
	
	static int num;
	
	static {
		System.out.println("Class was loaded!");
	}
	
	{
		System.out.println("Exemplarinitialisierer! " + num++);
	}
	

}
