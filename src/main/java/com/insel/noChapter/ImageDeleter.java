package com.insel.noChapter;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class ImageDeleter {
	//TODO CLEANUP CODE WHAT IS THIS???
	@SuppressWarnings("resource")
	public static void main(String [] args) throws IOException {
		
		System.out.println("Delete Images?");
		
		Path p = Path.of("C:\\MyF\\img");
		
		System.out.println(p);
		
		File dir = p.toFile();
		
		File[] files = dir.listFiles();
		int fileCount = files.length;
		int filesSkipped = 0;
		
		boolean deleteFiles = false;
		deleteFiles = new Scanner(System.in).nextBoolean();
		
		for(int i=0; i<fileCount; i++) {
			boolean small = false;
			boolean unscaled = false;
			
			String format = "";
			File f =files[i];
			Dimension o = null;
			
			try {
				o = getDimensions(f);
			} catch (IOException e) {
				System.out.println("Skipped: [" + f.getName() + "]");
				filesSkipped++;
				f.delete();
				continue;
			}
			
			int width = (int) o.getWidth();
			int height = (int) o.getHeight();
			
			if(width<1920 || height < 1080) {
				small = true;
				format += "[small]";
			}
			double ratio = (double) width / height;
			double goTo = (double) 16/9;
			double give = 0.1;
			
			//System.out.printf("%f%f", goTo+give, goTo-give);
			
			if(ratio >goTo+give || ratio < goTo-give) {
				unscaled = true;
				format += " [unscaled]";
			}
			if(deleteFiles && (unscaled || small) ) {
				f.delete();
				format += " [delete]";
			}
			System.out.printf("[%s] : %d %d %s%n", f.getName(), width, height, format);
			
		}
		System.out.println("Files skipped:" + filesSkipped);
		
	}
	
	private static Dimension getDimensions(File f) throws IOException {
		try(ImageInputStream in = ImageIO.createImageInputStream(f)) {
			final Iterator<ImageReader> readers = ImageIO.getImageReaders(in);
			if(readers.hasNext()) {
				ImageReader reader = readers.next();
				try {
					reader.setInput(in);
					return new Dimension(reader.getWidth(0), reader.getHeight(0));
				} finally {
					reader.dispose();
				}
			}
		} 
		
		throw new IOException();
	}

}
