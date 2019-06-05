package com.insel.util;

public class ResHelper { 
	public static ClassLoader classLoader;
	//Use this to load files from /src/main/resources

	static {
		classLoader = ResHelper.class.getClassLoader();
	}
	/*
	 * Example
	 * 
	 * File file = new File(ResHelper.classLoader.getResource("GifExample1.gif").getFile());
	 * RandomAccessFile f = new RandomAccessFile(file, "r");
	 * 
	 */
	
}
