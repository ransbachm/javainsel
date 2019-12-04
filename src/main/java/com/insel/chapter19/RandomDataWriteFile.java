package com.insel.chapter19;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDataWriteFile {
	public static void main(String [] args) throws IOException {

			
		RandomAccessFile r = new RandomAccessFile("C:\\users\\ransb\\Desktop\\Experiments\\RAMFile.rem", "rw");
		r.setLength(128);
		
		byte data = 1;
		byte newData = 0;
		// Go to end of file then stop
		while((r.length() > r.getFilePointer() ? data = r.readByte() : -1) != -1) {
			
			r.seek(r.getFilePointer()-1);
			r.write(newData = (byte) Math.round(Math.random() * 100 + 40));
			System.out.printf("%c -> %c%n", (char) data, (char) newData);
		}
		System.out.println("done");
		r.close();
		
	}

}
