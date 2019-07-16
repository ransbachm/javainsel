package com.insel.chapter10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ThingsToDo implements Iterator<String>, Iterable <String> {
	
	final private List<String> content;
	final private int length;
	private int index = 0;
	
	public ThingsToDo(String[] content) {
		this.content = Arrays.asList(content);
		this.length = this.content.size();
	}
	
	@Override public Iterator<String> iterator() {
		return this;
	}
	
	@Override public boolean hasNext() {
		if(index < length)
			return true;
		return false;
	}
	
	@Override public String next() {
		if(index<length)
			return content.get(index++);
		throw new NoSuchElementException();
	}
	
	public static void main(String [] args) {
		
		String[] things = {"Work it", "Make it", "Do it", "Make us"};
		System.out.println("Before iteraton");
		
		ThingsToDo ttd = new ThingsToDo(things);
		
		while(ttd.hasNext()) {
			System.out.println(ttd.next());
		}
		
		ttd = null;
		
		System.out.println("After Iteraton");
	}

}
