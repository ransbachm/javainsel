package com.insel.chapter11;

public class Box<E> implements ICanStore<E> {
	private E content; 
	public Box() {}
	public Box(E content){
		this.content = content;
	}
	@Override public void setContent(E content) {this.content = content;}
	
	/*public void setContent(String content) {this.content = (E) content;} 
	 *This would error on (1) and (2) but NOT here
	 */
	
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
		
		b1.setContent("relax /"); 	//(1)
		b2.setContent("study to");	//(2)
		
		System.out.println(b1.toString()+b2.getContent().toString());
	}

}
