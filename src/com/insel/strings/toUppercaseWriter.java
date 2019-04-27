package com.insel.strings;

public class toUppercaseWriter {
	public static void main (String[] args) {
		
		System.out.println("Type your String:");
		
		String input = new java.util.Scanner(System.in).nextLine();
		
		System.out.println(toUppercase(input));
		
	}
	public static String toUppercase(String input) {
		if(input == null || input.length() <= 0) {
			return "";
		}
		String o = "";
		
		for(int i=0; i<input.length(); i++) {
			char buf = input.charAt(i);
			if(Character.isWhitespace(buf)) {
				o += "_";
				continue;
			}
			o += Character.toUpperCase(buf);
		}
		
		
		return o;
	}

}
