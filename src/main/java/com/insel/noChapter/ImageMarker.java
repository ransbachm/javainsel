package com.insel.noChapter;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMarker {
	
	public static void main(String [] args) throws IOException {
		
		File f = new File("C:\\MyF\\ImageIO\\DSInput.png");
		BufferedImage image = ImageIO.read(f);
		
		int width = image.getWidth();
		int height = image.getHeight();
		System.out.println(width + " " + height);
		
		
		for(int y=0; y<height; y+=2) {
			for(int x=0; x<width; x+=2) {
				image.setRGB(x, y, ColorConverter.RGBAToInt(255, 0, 0, 255));
			}
		}
		
		File out = new File("C:\\MyF\\ImageIO\\DSOutput.png");
		ImageIO.write(image, "png", out);
		
		
	}

}
