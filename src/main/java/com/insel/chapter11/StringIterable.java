package com.insel.chapter11;

public class StringIterable implements CharIterable<RuntimeException> {
	private final String content;
	private int index = 0;
	
	StringIterable(String content) {
		this.content = content;
	}
	
	@Override public boolean hasNext() throws RuntimeException {
		return index < content.length();
	}

	@Override public char next() {
		return content.charAt(index++);
	}
	

}
