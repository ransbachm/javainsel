package com.insel.noChapter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageGenerator  {
	
	
	public static void main(String [] args) throws IOException {
		
		int width = 512;
		int height = 256;
		
		File f = null;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		for(int y=0; y<height; y++) {
			for(int x=0; x<width; x++) {
				
				int a = (int) (Math.random()*265);
				int r = (int) (Math.random()*265);
				int g = (int) (Math.random()*265);
				int b = (int) (Math.random()*265);
				
				int p = (a<<24) | (r<<16) | (g<<8) | b;
				
				image.setRGB(x, y, p);
			}
		}
		f = new File("C:\\MyF\\Out.png");
		ImageIO.write(image, "png", f);
		
	}

}
