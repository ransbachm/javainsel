package com.insel.chapter19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileLineByLine {
	public static void main(String [] args) throws IOException {
		Path path = Paths.get("C:\\Users\\ransb\\Desktop\\Experiments\\textfileWithLinebreaks.txt");
		
		try(BufferedReader buf = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1);
				BufferedReader buf2 = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
			
			// Classic way of doing
			String s;
			while((s = buf.readLine()) != null) {
				System.out.println(s);
			}
			
			System.out.println("\n\nAndother try\n\n");
			
			// New (declarative) way of doing
			buf2.lines().forEach(System.out::println);
		}
	}

}
