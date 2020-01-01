package com.insel.chapter19;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PPMImageCreator {
	public static void main(String [] args) throws InterruptedException {
		Path path = Paths.get("C:\\Users\\ransb\\Desktop\\Experiments\\testImage.ppm");
		
		try(OutputStream out = Files.newOutputStream(path)) {
			/* Writes yellow pixel to .ppm file
			 * Happens instantly IN THIS EXAMPLE write() doesn't have to behave like here
			 * the pixel will not change after waiting
			 * (for live view use https://imageglass.org/)
			 */
			out.write("P3 1 1 255 255 255 0 0".getBytes(StandardCharsets.ISO_8859_1));
			
			// Nothing will change from here on
			System.out.println("Sleep start");
			Thread.sleep(5000);
			System.out.println("Sleep done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
