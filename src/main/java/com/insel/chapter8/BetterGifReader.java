package com.insel.chapter8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.insel.util.ResHelper;

public class BetterGifReader {
	
	public static void main(String [] args) {
		
		RandomAccessFile f = null;
		
		try {
			
			File file = new File(ResHelper.class.getClassLoader().getResource("GifExample1.gif").getFile());
			f = new RandomAccessFile(file, "r");
			f.seek(6);
			
			//Calculates the height from the data read from the file
			String width = Integer.toString((f.read() + f.read()*256));
			String height = Integer.toString((f.read() + f.read()*256));
			
			System.out.printf("Das Gif hat %s mal %s Pixel.%n", width, height);
		} catch (FileNotFoundException e) {
			System.err.println("Die Datei wurde nicht gefunden");
		} catch (IOException e) {
			System.err.println("Allgemeiner IO Fehler");
		} finally {
			if(f!=null) {
				try {f.close();} catch(IOException e) {}
			}
		
		}
		
	}

}
