package com.insel.chapter19;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDataFile {
	/* 
	 * The data that is in the enlarged RandomAccessFile is not just undefined (p 1077) 
	 * but always null bytes.
	 */
	public static void main(String [] args) throws IOException {
		
		RandomAccessFile r = new RandomAccessFile("C:\\users\\ransb\\Desktop\\Experiments\\RAMFile.rem", "rw");
		r.setLength(128);
		
		byte data = 1;
		// Go to end of file then stop
		while((r.length() > r.getFilePointer() ? data = r.readByte() : -1) != -1) {
			if(data != 0) {
				System.out.println("Non null byte was found !" + (char) data);
				return;
			}
			System.out.println(data);
			
		}
		System.out.println("Just null bytes were found!");
		r.close();
		
		
	}
}
