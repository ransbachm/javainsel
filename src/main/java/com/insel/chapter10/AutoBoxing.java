package com.insel.chapter10;

public class AutoBoxing {
	
	public static void main(String [] args) {
		
		{
			Integer i = 1, j = 1;
			boolean b = (i <= j && j <= i && i != j);
			System.out.println(b);
		}
		
		{
			Integer i = 222, j = 222;
			boolean b = (i <= j && j <= i && i != j);
			System.out.println(b);
		}
	}

}
