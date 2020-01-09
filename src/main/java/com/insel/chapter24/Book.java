package com.insel.chapter24;

/**
 * Class that represents a simple book
 * 
 * @author https://github.com/ransbachm <br>
 * Repository at {@link https://github.com/ransbachm/javainsel}
 * 
 * @version 1.0
 * 
 */
public class Book {
	/** Name of the book*/
	private final String name;
	/** Number of pages the book has */
	private final int pages;
	/** Number of pages that were read */
	private int pagesRead;
	
	/**
	 * Constructs the Book with (int) name and (String) pages and (int) pages read
	 * 
	 * @param name -> name of the book | not empty (or just whitespace) or null | (String)
	 * @param pages -> amount of pages the book has | not < 0 | (int)
	 * 
	 * @throws IllegalArgumentException
	 * 
	 */
	public Book(String name, int pages) {
		if(name == null) 
			throw new IllegalArgumentException("null not allowed");
		if(name.trim().isEmpty())
			throw new IllegalArgumentException("no empty name allowed");
		if(pages < 0)
			throw new IllegalArgumentException("can not have fewer than zero pages");
		this.name = name;
		this.pages = pages;
	}
	
	/**
	 * Constructs the Book with (int) name and (String) pages and (int) pages read
	 * 
	 * @param name -> name of the book | not empty (or just whitespace) or null | (String)
	 * @param pages -> amount of pages the book has | not < 0 | (int)
	 * @param pagesRead -> amount of pages that were read | not < 0 | (int)
	 * 
	 * @throws IllegalArgumentException
	 * 
	 */
	public Book(String name, int pages, int pagesRead) {
		this(name, pages);
		if(pagesRead < 0)
			throw new IllegalArgumentException("can not have fewer than zero pages read");
		this.pagesRead = pagesRead;
	}
	
	/**
	 * Read pages on the book, increments (int) pages
	 * 
	 * @param pagesToRead | pagesToRead < 0 | pagesToRead < pagesRead + pagesToRead
	 * 
	 * @throws IllegalArgumentException
	 * 
	 */
	public void read(int pagesToRead) {
		if(pagesToRead < 0)
			throw new IllegalArgumentException("can not read fewer than 0 pages");
		if( (long) pagesToRead+pagesRead > pages)
			throw new IllegalArgumentException("can not read more pages than the book has");
		pagesRead += pagesToRead;
	}
	
	/**
	 * Return toString() representation of the object
	 * 
	 * @return String with the representation
	 * 
	 */
	@Override 
	public String toString() {
		return new StringBuilder("{Name: [") .append(name).append("], Pages: [")
				.append(pages).append("], Pages_Read: [").append(pagesRead).append("]}").toString();
	}
}
