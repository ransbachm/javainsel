package com.insel.chapter11;

public class Box<E> implements ICanStore<E> {
	private E content; 
	public Box() {}
	public Box(E content){
		this.content = content;
	}
	@Override public void setContent(E content) {this.content = content;}
	@Override public E getContent() {return this.content;}
	@Override public void clear() {this.content = null;}
	
	@Override public String toString() {
		return "Content: " + (this.getContent() == null ? "null" : this.getContent().toString()); 
	}
	
	public static void main(String [] args) {
		Box<String> b1 = new Box<>();
		var b2 = new Box<String>();
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.setContent("relax /");
		b2.setContent("study to");
		
		System.out.println(b1.toString()+b2.getContent().toString());
	}

}
