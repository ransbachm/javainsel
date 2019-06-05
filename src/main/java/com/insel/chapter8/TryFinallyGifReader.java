package com.insel.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.insel.util.ResHelper;

public class TryFinallyGifReader {
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		printGifSize("C:\\MyF\\GifExample1.gif\\");
	}
	
	
	public static void printGifSize(String filename) throws FileNotFoundException, IOException {
		
		File file = new File(ResHelper.class.getClassLoader().getResource("GifExample1.gif").getFile());
		RandomAccessFile f = new RandomAccessFile(file, "r");
		
		try {
			f.seek(6);
			String width = Integer.toString((f.read() + f.read()*256));
			String height = Integer.toString((f.read() + f.read()*256));
			System.out.printf("Das Gif hat %s mal %s Pixel.%n", width, height);
			
		} finally {
			f.close();
		}
		
	}

}
