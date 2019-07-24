package com.insel.chapter11;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class WebIterable implements CharIterable<IOException> {
	private final Reader reader;
	
	WebIterable(URL url) throws IOException {
		reader = new InputStreamReader(url.openStream());
	}
	@Override public boolean hasNext() throws IOException {
		return reader.ready();
	}

	@Override public char next() throws IOException {
		return (char) reader.read();
	}

}
