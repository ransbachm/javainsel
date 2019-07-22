package com.insel.chapter11;

public interface ICanStore<E> {
	public E getContent();
	public void setContent(E content);
	public void clear();
}
