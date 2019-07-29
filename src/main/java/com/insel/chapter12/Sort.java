package com.insel.chapter12;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
	public static void main(String [] args) {
		
		String [] things = {"   Banana", "\rPineapple", "\n\n\nApple", "   \nSteve Jobs"};
		
		System.out.println("-----------\n" + Arrays.deepToString(things) + "\n-----------\n");
		
		Comparator<String> comp = (s1, s2) -> {return s1.trim().compareTo(s2.trim());};
		//(String s1, String s2) would be ok too because the compiler can get the type
		//the second version would be better for readability
		Arrays.sort(things, comp);
		//Arrays.sort(things, (String s1, String s2) -> {return s1.trim().compareTo(s2.trim());});
		//shorter version
		
		
		System.out.println("\n-----------\n" + Arrays.toString(things) + "\n-----------");
	}

}
