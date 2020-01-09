package com.insel.chapter19;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class ResourceUser {
	public static void main(String [] args) throws IOException, URISyntaxException {
		URL url = Objects.requireNonNull(ResourceUser.class
				.getResource("/com/insel/resources/ExampleResourceTextFile.txt"), "File not present");
		
		
		// Im prinzip sollte das gehen, im prinzip ist der Tresor offen
		// Consoles don't linke unicode
		BufferedReader buf = Files.newBufferedReader(Paths.get(url.toURI()));
		buf.lines().forEach(System.out::println);
	}
	
}
