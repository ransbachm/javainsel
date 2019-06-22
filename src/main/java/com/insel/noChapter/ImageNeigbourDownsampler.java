package com.insel.noChapter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageNeigbourDownsampler {
	public static void main(String [] args) throws IOException {
		
		
		File inFile = new File("C:\\MyF\\ImageIO\\DSInput.png");
		BufferedImage imageIn = ImageIO.read(inFile);
		int maxScale = 4;
		int minScale = 1;
		
		for(int scale=minScale; scale!=maxScale; scale++) {
			File outFile = new File("C:\\MyF\\ImageIO\\DSOutput" + scale + ".png");
			
			int width = imageIn.getWidth();
			int height = imageIn.getHeight();
			BufferedImage imageOut = new BufferedImage((int) Math.ceil((double) width/scale),
					(int) Math.ceil((double) height/scale), BufferedImage.TYPE_4BYTE_ABGR);
					
			//System.out.println(width + " " + height);
			//System.out.println(imageOut.getWidth() + " " + imageOut.getHeight());
			
			
			
			for(int y=0; y<height; y+=scale) {
				for(int x=0; x<width; x+=scale) {
					//System.out.println(x/scale+" "+ y);
					imageOut.setRGB(x/scale, y/scale, imageIn.getRGB(x, y) );
					
				}
			}
			ImageIO.write(imageOut, "png", outFile);
		}
		
		System.out.println("Done!");
		
	}

}
