package com.insel.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.insel.util.ResHelper;


public class SimpleGifReader { //CALC HEIGHT AND WIDTH OF GIF --WIDTH ((BYTE 6) + ((BYTE 7) * 256)) for HEIGHT USE BYTE 8 and 9
	

	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		
		File file = new File(ResHelper.class.getResource("GifExample.gif").getFile());
		RandomAccessFile f = new RandomAccessFile(file, "r");
		f.seek(6);
		
		
		String width = Integer.toString((f.read() + f.read()*256));
		String height = Integer.toString((f.read() + f.read()*256));
		
		System.out.printf("Das Gif hat %s mal %s Pixel.%n", width, height);
		f.close();
	
	}

}
