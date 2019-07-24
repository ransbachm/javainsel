package com.insel.chapter11;

public interface CharIterable<E extends Exception> {
	public boolean hasNext() throws E;
	public char next() throws E; 

}
