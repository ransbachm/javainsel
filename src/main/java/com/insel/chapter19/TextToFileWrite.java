package com.insel.chapter19;

import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class TextToFileWrite {
	public static void main(String [] args) throws IOException {
		Path path = Paths.get("C:\\Users\\ransb\\Desktop\\Experiments\\textfile.txt");

		try(Writer out = Files.newBufferedWriter(path, StandardCharsets.ISO_8859_1)) {
			out.write("Endlich weiﬂ ich wie man anst‰ndig einfach in eine Datei schreibt!");
		}
		System.out.println("Done");
	}
}