package com.insel.noChapter;

public class ColorConverter {
	
	public static int genRandColorInt() {
		int a = (int) (Math.random()*265);
		int r = (int) (Math.random()*265);
		int g = (int) (Math.random()*265);
		int b = (int) (Math.random()*265);
		
		int p = (a<<24) | (r<<16) | (g<<8) | b;
		
		return p;
	}
	
	public static int RGBAToInt(int r, int g, int b, int a) {
		
		int p = (a<<24) | (r<<16) | (g<<8) | b;
		
		return p;
		
	}

}
